<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ include file="include.jsp" %>
<!DOCTYPE html>
<html lang="fr">
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Annuaire Amu - Projet JEE Master 2 informatique ISL">
        <meta name="author" content="Benjamin Magron / Florian Campanella">

        <title>Noel OR</title>
        <link rel="icon" type="image/png" href="/WEB-INF/assets/images/amu_logo.png" /> <!-- Favicon -->
        
        <!-- Bootstrap Core CSS -->
		<!-- Latest compiled and minified CSS -->
		<link 	rel="stylesheet" 
				href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
				integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
				crossorigin="anonymous"/>
		
		<!-- Optional theme -->
		<link	rel="stylesheet" 
				href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" 
				integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" 
				crossorigin="anonymous"/>
		
        <!-- Custom CSS -->
		<link href=<c:url value="/ressources/css/annuaire.css"/> rel="stylesheet" type="text/css">

		<!-- jQuery -->
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"
  			integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
  			crossorigin="anonymous"></script>
  			
  		  		<!-- Bootstrap Core JavaScript -->
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
			integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" 
			crossorigin="anonymous"/></script>
  			

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script type="text/javascript" src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script type="text/javascript" src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    
<%@ include file="tmpcss.jsp" %> <!--  TODO del this line -->
    <div class="container">