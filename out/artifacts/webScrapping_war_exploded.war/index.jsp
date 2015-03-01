
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Enter your URL</title>
  </head>
  <body>
    <form action="scrap" method="post">

        Enter url to analyze, after space enter word(s), use "," as delimiter <br>
        Command Line<input type="text" name="commandLine">
        <input type="submit"><br>
        You can use following data processing commands: <br>
        "-w" count number of provided words <br>
        "-c" count number of characters of web page <br>
        "-e" extract sentences’ which contain given words<br>
    </form>
  </body>
</html>
