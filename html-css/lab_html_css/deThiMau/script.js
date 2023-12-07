function ValidateForm() {
    var email = document.getElementById('email').value;
    var com = document.getElementById('com').value;
    var rate = document.getElementById('rate').value;
    var name = document.getElementById('Name').value;
    var sdt = document.getElementById('SDT').value;

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
    if(!/^(?=.*[A-Z])(?=.*[a-z])[\w]+\s[\w]+$/.test(name) || name === '') {
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