<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/jsp/include/header.jsp"%>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function() {
		$(".zicoUri").zicoUri();

		var rowData = [];
		
		rowData.push('<tr>');
			rowData.push('<td></td>');
			rowData.push('<td><input type="text" name="codeId" class="form-control" placeholder=""></td>');
			rowData.push('<td><input type="text" name="codeNm" class="form-control" placeholder=""></td>');
			rowData.push('<td>');
			rowData.push('<select class="form-control" name="sort" id="sort">');
			rowData.push('<option value="1">1</option>');
			rowData.push('<option value="2">2</option>');
			rowData.push('</select>');
			rowData.push('</td>');
			rowData.push('<td>');
			rowData.push('<select class="form-control" name="useYn" id="useYn">');
			rowData.push('<option value="Y">사용함</option>');
			rowData.push('<option value="N">사용안함</option>');
			rowData.push('</select>');
			rowData.push('</td>');
			rowData.push('<td class="text-center">');
			rowData.push('<span class="align-bottom"><i class="fa fa-trash-o fa-fw"></i></span>');
			rowData.push('</td>');
			rowData.push('</tr>');
		
		$(".rowAdd").on("click", function(e) {
			console.log(rowData.join(''));
			$('.table').find("tbody:last").append(rowData.join(''));
			return false;
		});
	});
</script>
</head>
<body>
	<div id="wrapper">
		<%@ include file="/WEB-INF/jsp/include/menu.jsp"%>

		<div id="page-wrapper">
		<form:form modelAttribute="commCodeDTO" class="form-horizontal">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">공통코드 신규등록</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>

			<div class="row">
				<div class="col-lg-12">
					<!-- /.panel -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<i class="fa fa-search fa-fw"></i> 정보
							<div class="pull-right">
								<button type="button"
									data-uri="<c:url value='/comm/commCodeListInsert.zico' />"
									data-method="form"
									class="btn btn-primary btn-xs zicoUri">
									등록
								</button>
							</div>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<div class="form-group">
										<label for="groupCodeId" class="col-sm-2 control-label">그룹코드ID</label>
										<div class="col-sm-10">
											<input type="text" name="groupCodeId" class="form-control" id="groupCodeId" placeholder="">
										</div>
									</div>
									<div class="form-group">
										<label for="groupCodeNm" class="col-sm-2 control-label">그룹코드명</label>
										<div class="col-sm-10">
											<input type="text" name="groupCodeNm" class="form-control" id="groupCodeNm" placeholder="">
										</div>
									</div>
									<div class="form-group">
										<label for="parentGroupCodeId" class="col-sm-2 control-label">부모그룹코드(ID + NAME)</label>
										<div class="col-sm-10">
											<select class="form-control" name="parentGroupCodeId" id="parentGroupCodeId">
												<option value="1">1</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="parentCodeId" class="col-sm-2 control-label">부모코드(ID + NAME)</label>
										<div class="col-sm-10">
											<select class="form-control" name="parentCodeId" id="parentCodeId">
												<option value="1">1</option>
												<option value="2">1</option>
											</select>
										</div>
									</div>
								</div>
								<!-- /.col-lg-12 (nested) -->
							</div>
							<!-- /.row -->
						</div>
						<!-- /.panel-body -->
						<div class="panel-heading">
							<i class="fa fa-table fa-fw"></i> 공통코드 리스트
								<div class="pull-right">
									<button type="button"
										class="btn btn-primary btn-xs rowAdd">
										행추가
									</button>
								</div>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<div class="table-responsive">
										<table class="table table-bordered table-hover table-striped">
											<thead>
												<tr>
													<th class="text-center">#</th>
													<th class="text-center">코드ID</th>
													<th class="text-center">코드명</th>
													<th class="text-center">순서</th>
													<th class="text-center">사용여부</th>
													<th class="text-center">제거</th>
												</tr>
											</thead>
											<tbody>
											</tbody>
										</table>
									</div>
									<!-- /.table-responsive -->
								</div>
								<!-- /.col-lg-12 (nested) -->
							</div>
							<!-- /.row -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
			</div>
			</form:form>
		</div>
	</div>
</body>
</html>
