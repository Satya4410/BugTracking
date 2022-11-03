
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>





<div align = "center">
<style type="text/css">
body {
  background-image: url('agent0.jpg');
  background-repeat: no-repeat;
  background-size: cover;
}

.SatyaHome
{   
    background-color: yellow;    
    
   

    font-size: 20px;
    margin-top:10px;
    margin-bottom:1px;
    margin-left:500px;
    margin-right:500px;
    border:0px solid black;
    border-radius:0px;
    size :10;
}




</style>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="SatyaHome"><a href="main">Back To Home Dashboard</a></div>


<h1>Enter Details</h1>
<form action="save">
<label>Project Name  :</label><br/>
<input type="text" name="projectname"><br/>

<label>Description :</label><br/>
<input type="text" name="descriptions"><br/>

<label>Comments :</label><br/>
<input type="text" name="comments"><br/>

<center>

<label>category :</label><br/> 
<select class="form-control" style="width: 165px " , style=" font-size : 16px " name="category" > 


<option value ="-1">Select Category</option>
<option value ="Bug">Bug</option>
<option value ="User Story">User Story</option>
<option value ="Epic">Epic</option>
<option value ="Improvement">Improvement</option>
<option value ="Task">Task</option>
<option value ="Defect">Defect</option>
<option value ="New Feature">New Feature</option>
<option value ="Initiative">Initiative</option>
<option value ="Test">Test</option>
<option value ="Depandency">Depandency</option>





</select>
</center>





<label>Start Date :</label><br/>
<input type="date" name="startdate"><br/>
<label>End Start :</label><br/>
<input type="date" name="enddate"><br/>




<input type="submit" value="Save">


</form>
${message}
</body>
</html>