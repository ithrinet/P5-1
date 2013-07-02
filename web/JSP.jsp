<%-- 
    Document   : JSP
    Created on : 25 juin 2013, 14:34:46
    Author     : AZZOUZ
--%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="css/cssLayout.css" rel="stylesheet" type="text/css" />
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <title>Informarcion Con JSP</title>
    </head>
    <body>
         <div id="top" class="top">
            <div class="container" >
                <div class="row-fluid">
                    <div class="span12">
                        <h1>Practica 5-1 JEE</h1>
                    </div>
                </div>
            </div>
        </div>                
        <div id="container" class="center_content">
            <div class="container">
                    <div class="row-fluid">
                        <!-- .inner -->
                        <div class="span12 inner">
                            <!--BEGIN INPUT TEXT FIELDS-->
                            <div class="row-fluid">
                                <div class="span12">
                                    <div class="box">
                                        <header>
                                            <div class="icons"><i class="icon-edit"></i></div>
                                            <h5>Informacion con Pagina JSP</h5>
                                            <!-- /.toolbar -->
                                        </header>
                                        <div id="div-1" class="accordion-body collapse in body">
                                            <table class="table">
                                                    
                                                <tbody>
                                                    <tr>
                                                        <th>Metodo</th>
                                                        <td><%= request.getMethod()%></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Protocolo: </th>
                                                        <td><%= request.getProtocol() %></td>
                                                    </tr>
                                                    <tr>
                                                        <th>IP Cliente</th>
                                                        <td><%= request.getRemoteAddr()%></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Host Cliente</th>
                                                        <td><%= request.getRemoteHost() %></td>
                                                    </tr>
                                                    <tr>
                                                        <th>URL</th>
                                                        <td><%= request.getRequestURL() %></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Nombre Path</th>
                                                        <td><%= request.getServletPath() %></td>
                                                    </tr>                                                    
                                                    <tr>
                                                        <th>Query String</th>
                                                        <td><%= request.getQueryString() %></td>
                                                    </tr>                                                    
                                                    <tr>
                                                        <th>Host</th>
                                                        <td><%= request.getHeader("Host")%></td>
                                                    </tr>
                                                    <tr>
                                                        <th>Connection</th>
                                                        <td><%= request.getHeader("connection")%></td>
                                                    </tr>                                                    
                                                    <tr>
                                                        <th>User Agent</th>
                                                        <td><%= request.getHeader("User-Agent")%></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>            
        </div>

    </body>
</html>
