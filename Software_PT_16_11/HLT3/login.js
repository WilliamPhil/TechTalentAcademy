

function validation(){

    //variable declaration
    var name = $("#fullname").val() ;
    var email = $("#email").val();
    var phone = $("#phone").val();
    var country = $("#country").val();
    var gender = $("#gender").val();

    


        //Name Validation
    if(name == ""){

       $("#nameErr").html("Please enter your full name");

    }
    else
    {
        $("#nameErr").html("");
        $("#fullname").html(name.trim());
    }

    
        //Email validation
    if(email == ""){

       $("#emailErr").html("Please enter a your email address");

    }
    else
    {
        
        var regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if (regex.test(email))
        {       
             $("#emailErr").html("");
             $("#email").html(email);
        }
        else{

            $("#emailErr").html("You have entered an invalid email address!")
        }
         
    }

    //Mobile Phone Validation
    if(phone == ""){

        $("#phoneErr").html("Please enter your mobile number");
 
     }
     else
     {
         var phoneno = /^\d{11}$/;

         if(phoneno.test(phone)){
            $("#phoneErr").html("");
            $("#phone").html(phone);
         }
         else
         {
            $("#phoneErr").html("invalid mobile number, please enter your 11 digit number")
         }

        
     }

     //Country validation
     if(country == "Select"){

        $("#countryErr").html("Please select your country");
 
     }
     else
     {
         $("#countryErr").html("");
     }

     //Gender validation
     if(gender == ""){

        $("#genderErr").html("Please choose a gender");
 
     }
     else
     {
         $("#genderErr").html("");
     }

}


$("#submit-btn").click(function(){

   validation();

});