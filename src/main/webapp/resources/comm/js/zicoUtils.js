/**
 * 
 */

;(function($) {
	function ZicoUri(selector) {
		this.$ele = null;
		this.uri = null;
		this.method = null;
		this.keys = null;
		this.values = null;
		this.hasParams = false;
		
		this._init(selector);
		this._initEvent();
	}
	
	ZicoUri.prototype._init = function(selector) {
		this.$ele = $(selector);
		this.uri = this.$ele.data("uri") || "";
		this.method = this.$ele.data("method") || "href";
		
		if (typeof this.$ele.data("keys") != "undefined" && typeof this.$ele.data("values") != "undefined") {
			this.hasParams = true;
			
			this.keys = this.$ele.data("keys").split("|") || "";
			this.values = this.$ele.data("values").split("|") || "";
		}
	}
	
	ZicoUri.prototype._initEvent = function() {
		var that = this;
		
		that.$ele.on("click", function(event) {
			if ("form" === that.method) {
				document.forms[0].method = "post";
				document.forms[0].action = that.uri;
				
				if (that.hasParams) {
					that._setParams();
				}
				console.log($("form").serialize());
				document.forms[0].submit();
			} else if ("href" === that.method) {
				document.location.href = that.uri;
			}
		});
	};
	
	ZicoUri.prototype._setParams = function() {
		for (var i = 0; i < this.keys.length; i++) {
			console.log(this.keys[i], this.values[i]);
			if (document.getElementsByName(this.keys[i]).length !== 0) {
				document.getElementsByName(this.keys[i])[0].value = this.values[i];
			} else {
				var ele = document.createElement("input");
				ele.setAttribute("name", this.keys[i]);
				ele.setAttribute("type", "hidden");
				
				ele.value = this.values[i];
				
				document.forms[0].appendChild(ele);
			}
		}
	};
	
	$.fn["zicoUri"] = function(selector) {
		return this.each(function() {
			$.data(this, "zicoUri", new ZicoUri(this));
		});
	};
}(jQuery));