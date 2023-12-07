function ValidateForm() {
    var email = document.getElementById('email').value;
    var com = document.getElementById('com').value;
    var rate = document.getElementById('rate').value;
    var name = document.getElementById('Name').value;
    var sdt = document.getElementById('SDT').value;


    if (password.length < 8) {
        return false;
    }

    // Kiểm tra chứa ít nhất một chữ cái hoa và một chữ cái thường
    const hasUppercase = /[A-Z]/.test(password);
    const hasLowercase = /[a-z]/.test(password);

    if (!hasUppercase || !hasLowercase) {
        return false;
    }

    // Kiểm tra chứa ít nhất một số
    const hasNumber = /\d/.test(password);

    if (!hasNumber) {
        return false;
    }

    // Kiểm tra chứa ít nhất một ký tự đặc biệt hoặc ký tự không phải chữ cái hoặc số
    const hasSpecialChar = /[!@#$%^&*()_+\-=[\]{};':"\\|,.<>/?]/.test(password);

    if (!hasSpecialChar) {
        return false;
    }
    
    //check sdt 
    if (!/^(?:(?:\+\d{1,3})?[\s.-]?)?\(?(\d{3})\)?[\s.-]?(\d{3})[\s.-]?(\d{3})$/.test(sdt) || sdt === '') {
        alert('please enter valid phone number')
        return false
    }

    //check sdt 2 : 
    if (/^(?:\+?84|0)(?:\d){9,10}$/.test(sdt)) {
        alert('dsada')
        return false
    }

    //check name
    if(name.charAt(0) !== name.charAt(0).toUpperCase() || name === '' || !/^[A-Za-z\s]+$/.test(name)|| !name.includes(' ')) {
        alert('please enter valid name')
        return false
    }

    //check email
    if (!/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/i.test(email) || email === '') {
        alert('Please enter a valid email')
        return false;
    }

    //check cmt 
    if (com === "") {
        alert('Please enter a comment')
        return false
    }

    //check rate :
    if (rate == "" || isNaN(rate) || rate < 0 || rate > 5) {
        alert('plase enter rate about 0 and 5')
        return false
    }
    return true
}

var form = document.getElementById('submit')
form.addEventListener('click',function(){
    if(!ValidateForm()) {
        event.preventDefault()
    }
})