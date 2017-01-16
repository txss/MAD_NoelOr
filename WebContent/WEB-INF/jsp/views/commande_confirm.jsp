<%@ include file="/WEB-INF/jsp/templates/include.jsp" %>
<%@ include file="/WEB-INF/jsp/templates/header.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/nav_bar.jsp"%>

	<c:if test="${product.name != ''}">
		<p>Vous avez acheté l'article: ${product.name}</p>
	</c:if>
	<c:if test="${product == null}">
		<p>Une erreur s'est produite lors de l'achat de votre article</p>
	</c:if>
	
<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>