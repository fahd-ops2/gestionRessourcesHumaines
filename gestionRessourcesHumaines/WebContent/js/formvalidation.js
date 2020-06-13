// select all imputs
const email= document.getElementById("email");
const password= document.getElementById("password");
const confirmPassword= document.getElementById("confirmPassword");
const nom= document.getElementById("nom");
const prenom= document.getElementById("prenom");
//select Form
const form=document.getElementById("myForm");
// validation colors
const green='#4CAF50';
const red ="#f44336";

//Stop submit
function validateForm(){
        //prevent default behavior
        
        if(!validateNom() && !validatePrenom() && !validatePassword() && !validateEmail() && !validateConfirmPassword()){
            alert("Form non valide");
            return false;
        }
        return true ;
}
//vakidators
function validateNom(){
    //check if it empty
    if(checkIfEmpty(nom)) return;
    //check if has only littls
    if(checkIfOnlyLetters(nom))return;
    return true;
}

function validatePrenom(){
    //check if it empty
    if(checkIfEmpty(prenom)) return;
    //check if has only littls
    if(checkIfOnlyLetters(prenom))return;
    return true;
}
function validatePassword(){
    // password not empty
    if(checkIfEmpty(password)) return;
    //Must be in 7chars
    if(!meetLength(password,6,100)) return ;
    // check password against our character set
    // 1- a
    //2- a 1
    //3- A a 1
  
    if(!containssCharacters(password,1)) return ;
    if(!containssCharacters(password,2)) return ;
    if(!containssCharacters(password,3)) return ;

    return true ;

}
function validateConfirmPassword(){
    if(password.className!==`form-control is-valid`){
        setInvalid(confirmPassword,"Password must be valid");
    }
    //if they match
    if(password.value !== confirmPassword.value){
        setInvalid(confirmPassword,"Password not same")
    }else{
        setValid(confirmPassword);
    }

}
function validateEmail(){
    if(checkIfEmpty(email))return;
    if(!containssCharacters(email, 5)) return ;
    return true;
}

//utility functions
function checkIfEmpty(field){
    if(isEmpty(field.value.trim())) {
        setInvalid(field,`${field.name} must not be empty`);
        return true;
    }else{
        setValid(field);
        return false;
    }
}
function isEmpty( value){
    if(value==="") return true;
    return false;
}
function setInvalid(field,message){
    field.className='form-control is-invalid';
    field.nextElementSibling.innerText=message;
    field.nextElementSibling.style.color=red;
    field.nextElementSibling.style.display="block";
}
function setValid(field){
    field.className='form-control is-valid';
    
   // field.nextElementSibling.style.color=red;
   field.nextElementSibling.style.display="none";
}
function checkIfOnlyLetters(field){
    if(/^[a-zA-Z]+$/.test(field.value)){
        setValid(field);
        return true;
    }else{
        setInvalid(field,'${field.name} must contain only letters');
        return false;
    }

}
function meetLength(field,minLength , maxLength){
    if(field.value.length>=minLength && field.value.length<maxLength){
        setValid(field);
        return true;

    }else if(field.value.length<minLength){
        setInvalid(field,`${field.name} must be at lest ${minLength} charcters long`);
        return false;

    }else{
        setInvalid(field,`${field.name} must be shorter then ${maxLength} charcters`);
        return false ;
    }

}

function containssCharacters(field , code){
    let regEx;
    switch(code){
        case 1 :
            //letters
            regEx =/(?=.*[a-zA-Z])/;
            return matchWithRegEx(regEx,field,`must contain at lest one letter`);
        case 2:
            //letters and numbers 
            regEx=/(?=.*\d)(?=.*[a-zA-Z])/;
            return matchWithRegEx(regEx,field,`must contain at lest one letter and one number`);
        case 3:
            //lower case and upper case 
            regEx=/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])/;
            return matchWithRegEx(regEx,field,`must contain at lest one uppercase and one letter lower case and number`);
        case 5:
            //email
            regEx= /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            return matchWithRegEx(regEx,field,'Email invalid');
        default:
            return false;
    }
}
function matchWithRegEx(regEx , field , message){
    if(field.value.match(regEx)){
        setValid(field);
        return true;
    }else{
        setInvalid(field,message)
    }
}