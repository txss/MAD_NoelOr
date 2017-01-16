<%@ include file="/WEB-INF/jsp/templates/include.jsp" %>
<%@ include file="/WEB-INF/jsp/templates/header.jsp"%>
<%@ include file="/WEB-INF/jsp/templates/nav_bar.jsp"%>



<div class="container lister">
	<h3>Voici tous nos packs de produits:</h3>
    <ul style="list-style-type: square">
	    <c:forEach items="${giftPack_list}" var="giftpack">
	        <li><a href="show_giftpack.htm?id=${giftpack.id}">${giftpack.id}</a></li>
	    </c:forEach>
	</ul>
</div>

<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>