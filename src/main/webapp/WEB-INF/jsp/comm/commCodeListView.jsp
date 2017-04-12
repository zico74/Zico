<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/jsp/include/header.jsp"%>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function() {
		$(".zicoUri").zicoUri();
	});
</script>
</head>
<body>
<form></form>
	<div id="wrapper">
		<%@ include file="/WEB-INF/jsp/include/menu.jsp"%>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">공통코드</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>

			<div class="row">
				<div class="col-lg-12">
					<!-- /.panel -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<i class="fa fa-search fa-fw"></i> 조회조건
							<div class="pull-right">
								<button type="button"
									data-uri="<c:url value='/comm/commCodeSearch.zico' />"
									data-method="form"
									class="btn btn-primary btn-xs zicoUri">
									검색
								</button>
								<button type="button"
									data-uri="<c:url value='/comm/commCodeListInsert.zico' />"
									data-method="href"
									class="btn btn-success btn-xs zicoUri">
									신규등록
								</button>
							</div>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
								</div>
								<!-- /.col-lg-12 (nested) -->
							</div>
							<!-- /.row -->
						</div>
						<!-- /.panel-body -->
						<div class="panel-heading">
							<i class="fa fa-table fa-fw"></i> 공통코드 리스트
							<div class="pull-right">
								<div class="btn-group">
									<button type="button"
										class="btn btn-default btn-xs dropdown-toggle"
										data-toggle="dropdown">
										Actions <span class="caret"></span>
									</button>
									<ul class="dropdown-menu pull-right" role="menu">
										<li><a href="#">Action</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li class="divider"></li>
										<li><a href="#">Separated link</a></li>
									</ul>
								</div>
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
													<th class="text-center">그룹코드ID</th>
													<th class="text-center">코드ID</th>
													<th class="text-center">그룹코드명</th>
													<th class="text-center">코드명</th>
													<th class="text-center">순서</th>
													<th class="text-center">부모그룹코드ID</th>
													<th class="text-center">부모코드ID</th>
													<th class="text-center">사용여부</th>
												</tr>
											</thead>
											<tbody>
												<c:if test="${commCodePage.totalElements==0}">
													<tr><td colspan="9" class="text-center">조회결과가 없습니다.</td></tr>
												</c:if>
												<c:forEach var="commCode" items="${commCodePage.content}" varStatus="st">
													<tr class="zicoUri"
														data-uri="<c:url value='/comm/findGroupCodeIdList.zico' />"
														data-method="form"
														data-keys="groupCodeId"
														<%-- data-values="${commCode.groupCodeId }" --%>
														role="button"
														>
														<td>${st.index + 1 }${commCode }</td>
														<%-- <td>${commCode.groupCodeId }</td>
														<td>${commCode.codeId }</td>
														<td>${commCode.groupCodeNm }</td>
														<td>${commCode.codeNm }</td>
														<td>${commCode.sort }</td>
														<td>${commCode.parentGroupCodeId }</td>
														<td>${commCode.parentCodeId }</td>
														<td>${commCode.useYn }</td> --%>
													</tr>
												</c:forEach>
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
		</div>
	</div>
</body>
</html>
