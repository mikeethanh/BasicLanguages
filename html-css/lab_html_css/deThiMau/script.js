function ValidateForm {
    var email = document.getElementById('email');
    var com = document.getElementById('com');
    var rate = document.getElementById('rate');

    //check email
    if (!/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/i.test(email) || email === "") {
        alert('Please enter a valid email')
        return false;
    }

    
}