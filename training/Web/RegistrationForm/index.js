const PASSWORDS_MATCH = "Passwords match";
const N_PASSWORD_MATCH = "Passwords dont match";

// password visibility
document.getElementById('toggle-password').addEventListener('click', function(){
    password_input = document.getElementById("passwd");
    if(this.className == "fa fa-eye-slash"){
        this.className = "fa fa-eye";
        password_input.type = "text";
    }
    else{
        this.className = "fa fa-eye-slash";
        password_input.type = "password";
    }
});

//password strength
document.getElementById('passwd').addEventListener('keyup', function(){
    var password = this.value;
    var passwd_label = document.getElementById('passwd-strength')
    if(password.length < 5){
        passwd_label.innerHTML = "Weak";
        passwd_label.setAttribute('style', 'color:red');
    }
    else if(password.length < 8){
        passwd_label.innerHTML = "Good";
        passwd_label.setAttribute('style', 'color: orange');
    }
    else{
        passwd_label.innerHTML = "Strong";
        passwd_label.setAttribute('style', 'color: green');
    }
});

// password matching
document.getElementById('conf_passwd').addEventListener('keyup', function(){
    var passwd = document.getElementById('passwd').value;
    var conf_passwd = this.value;
    var passwd_label = document.getElementById('passwd-confirmation');
    if(passwd == conf_passwd){
        passwd_label.innerHTML = PASSWORDS_MATCH;
        passwd_label.setAttribute('style', 'color: green');
    }
    else{
        passwd_label.innerHTML = N_PASSWORD_MATCH;
        passwd_label.setAttribute('style', 'color: red');
    }
});

// gender image
document.getElementById('gender').addEventListener('change', function(){
    console.log('gender change');
    var gender =this.value;
    var gender_image = document.getElementById('gender-img');
    if(gender == "male"){
        gender_image.className = "fa fa-mars";
    }
    else{
        gender_image.className = "fa fa-venus";
    }
});

// Registration confirmation
document.getElementById('register').addEventListener('click', function(){
    var username = document.getElementById('name').value;
    var passwd = document.getElementById('passwd').value;
    var passwd_strength = document.getElementById('passwd-strength').innerHTML;
    var pass_confirm = document.getElementById('passwd-confirmation').innerHTML;
    var reg_message = document.getElementById('register-message');
    var reg_success = true;
    reg_message.innerHTML = "";
    reg_message.setAttribute('style', 'color: red');

    if(username.length == 0){
        reg_message.innerHTML += "Please enter valid username.<br>";
        reg_success = false;
    }
    else{
        const alphanumeric = /^[\p{L}\p{N}]+$/u;
        for(let i =0; i<username.length; i++){
            if(!username[i].match(alphanumeric)){
                reg_message.innerHTML += "Username must contain only letters and digits.<br>";
                reg_success = false;
                break;
            }
        }
    }
    if(passwd_strength == "Weak"){
        reg_message.innerHTML += "Please use a longer password.<br>";
        reg_success = false;
    }

    if(pass_confirm == N_PASSWORD_MATCH){
        reg_message.innerHTML += "Please confirm the password.<br>";
        reg_success = false;
    }

    if(reg_success){
        reg_message.innerHTML = "Registration Successful.<br>";
        reg_message.setAttribute('style', 'color: green');
    }
});