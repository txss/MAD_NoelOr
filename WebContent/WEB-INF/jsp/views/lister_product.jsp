<%@ include file="/WEB-INF/jsp/templates/include.jsp" %>
<%@ include file="/WEB-INF/jsp/templates/header.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/nav_bar.jsp"%>


<div class="container lister">
	<h3>listing des produits</h3>
    <ul style="list-style-type: square">
	    <c:forEach items="${products_list}" var="prod">
	        <li><a href="show_product.htm?id=${prod.id}">${prod.name}</a></li>
	    </c:forEach>
	</ul>
</div>

<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>