<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />
  <link rel="stylesheet" href="css/style.css" />
<body>

 


 <div  align = "center"><h1>Connecting to</h1></div>
 

<style>

 body {
  background-image: url('spd1.jpg');
  background-repeat: no-repeat;
  background-size: cover;  
}
.modify
{  
	background-color: white;    
    text-align: center;
    font-family:arial;
    text-align: center;
    font-size: 22px;
    margin-top:100px;
    margin-bottom:10px;
    margin-left:400px;
    margin-right:400px;
    border:1px ;
    border-radius:10px;
    
    
    
    min-height: 100vh;
    max-width: 380px;
    margin: 0 auto;
    
 
	
}






i
{

    margin-left: -37px;
    cursor: pointer;

}

</style>


 
 <div class="modify">
 
<form action="home">
<tr align="left" valign="top">
<div>
<img src="images1.jpg"   style="width:70px;height:40px; margin-top:22px;  ">
</div>

<div >
<img src="india.jpg" style="height:90px; width:90px; margin-top:42px; border-radius: 60%;  "    >
</div>

<label for="universal" style= " margin-top:50px;" >Universal login <br></label>


<div class="login">

<p>
   <label for="username">Username: <br></label>
  <input type="text" name="username" id="username"  style="height:27px;font-size:14pt; size:20; " >
 
</p>
</div>

<p>
    <label for="password">Password:<br></label>
   <input type="password" name="passwrd" id="password" style="height:27px;font-size:14pt; size:20; " />
   <i class="bi bi-eye-slash" id="togglePassword"></i>
 </p>
<div class="placeholder-box">
<input type="submit" value="Login" style="background-color:#526b6e;  font-size: 20px;  "><br><br>
<button> register</button>

 ${message}
</div>

</tr>
</form>
</div>
 <script>
        const togglePassword = document.querySelector("#togglePassword");
        const password = document.querySelector("#password");

        togglePassword.addEventListener("click", function () {
            // toggle the type attribute
            const type = password.getAttribute("type") === "password" ? "text" : "password";
            password.setAttribute("type", type);
            
            // toggle the icon
            this.classList.toggle("bi-eye");
     
      
        });
    </script>



</body>
</html>