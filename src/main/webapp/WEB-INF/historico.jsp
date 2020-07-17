<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Historico</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="resources/css/historico.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/historico.js"></script>
    </head>
    <body>

        <h1><font color="green">Historico</font></h1>

        <div class="container">
            <table id="t01">
                <tr>
                <td>100 + 20</td>
                </tr>
                <tr>
                <td> 30 + 9</td>
                </tr>
                <tr>
                <td> 10 * 9</td>
                </tr>
            </table>
        </div>
        <div>
            <button onclick="calcular()">Retornar</button>
        </div>
    </body>
</html>