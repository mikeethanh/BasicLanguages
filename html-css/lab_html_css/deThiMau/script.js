function ValidateForm() {
    var name = document.getElementById('Name').value
    var email = document.getElementById('email').value
    var com = document.getElementById('com').valueyu
    var rate = document.getElementById('rate').value

    if (!/^([A-Z][a-z]*\s)*[A-Z][a-z]*$/.test(name)) {
        alert('Please enter valid name')
        return false
    }

    if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email) || email === "") {
        alert('Please enter valid email')
        return false
    }

    if (com === "") {
        alert('Please enter comment')
        return false
    }

    if (isNaN(rate) || rate < 0 || rate > 5) {
        alert('Please enter rating')
        return true
    }
    return true
}

var form = document.getElementById('submit')
form.addEventListener('click',function() {
    if(!ValidateForm()) {
        event.preventDefault()
    }
})