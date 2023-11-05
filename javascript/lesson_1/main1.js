// alert('Hi javascript basic')

// khai bao bien
var fullName = 'Nguyen Mai Thanh';
var age = 26;

// goi ham thong bao 
 alert(fullName);
 alert(age);


/**
 * built-in function:
 * 1. alert
 * 2.console
 * 3.confirm
 * 4.prompt
 * 5 set timeout
 * 6 set interval
 */


console.log('day la 1 dong log')
console.warn()
console.error()

// giong alert
confirm('Xac nhan ban du tuoi');

prompt('xan nhan ban du tuoi')

// sau 1 khoang thoi gian thi hien alert(thong bao)
setTimeout(function() {
     alert('thong bao')
},1000)

setInterval(function() {
      console.log('day la log')
},)

 
// operator
/** 
 * 1,arithmetic:so hoc 
 * assignment: gan 
 * comparison: so sanh
 * logical:logic
 */

 var a = 1+2;//+-*
console.log(a)

var fullName = 'nguyen mai thanh' // toan tu gan

var a = 1;
var b = 2;
if (a == b) {
    alert('dung')
}

var a = 1;
var b = 2 ; 
if(a > 0 && b > 0) { 
    alert('a va b lon hon 0')
}

//arithmetic: toan tu ++ -- hau to & tien to 
///prefix & postfix

var a = 6;  
 //viec 1 : +1 cho a , a = a +1 => a = 7
 //viec 2 : tra ve a sau khi duoc +1
 var output = ++a;
console.log(output);
//7 

//viec 1: 'a copy' , a copy  = 6 
//viec 2 : a = a + 1 = 7
//viec 3: tra ve a copy
var output = a++;
console.log(output)
//6
console.log(a)
//7



//string operator
var firstName = "Thanh"
var LastName = "Nguyen"
console.log(firstName + ' '+ LastName)

/**
 * Kieu giu lieu 
 *  Du lieu nguyen thuy : 
 * number 
 * striing 
 * boolean
 * undefined
 * null
 * symbol
 
 * du lieu phuc tap 
 * Function
 * object
 */

//number type
var a = 1 
var b = 2 
var c = 1.5

//string type
var fullName = 'Nguyen Thanh'

//undefined type 
var age; 

// null 
var isNull = null;

//Symbol
var id = Symbol('id');//unique

console.log(id);

//function
var myFunction = function() { 
    alert('Hi , xin chao');
}
myFunction();

//object type 
var myObject = {
    name: 'Son Dang',
    age: 18,
    address: 'Ha Noi'
}

// 
var myArray = [
    'java',
    'PHP',
    'Ruby',
]

//toan tu so sanh (===,!==) so sanh ca ve data type
var a = 1 
var b = '1'

//toan tu logic
var res = null && 'A' && 'B'
// null
var res = 'A' && 'B' && 'C'
//C

var res = 'A' || 'B' || 'C'
// A
var res = null||'B' || 'C'
// B


/**string 
 * 
 * 1.tao chuoi 
 * 2.mot so case su dung backslash
 * 3.xem do dai chuoi 
 * 4.chu y do dai khi vet code
 * 5.templater string ES6
 */

//backslash
var fullName = 'mai thanh la \'mama boy\''
//mai thanh la 'mama boy'

console.log(fullName.length)

console.log(`toi la : ${firstName} ${LastName}`)

/**
 * cac cach lam vec voi chuoi
 * 1.length
 * 2.find index
 * 3.cut string
 * 4.replace
 * 5.convert to upper case
 * 6.convert to lower case
 * 7.trm
 * 8.spit
 * 9.get a character index
 */

var myString = 'hoc js tai js js  f8'

console.log(myString.lastIndexOf('JS'))

//cat string 
console.log(myString(myString.slice(4,6)))

console.log(myString.replace('Js','Javascript'))
console.log(myString.replace(/JS/g,'Javascript'))

console.log(myString.toUpperCase())
console.log(myString.toLowerCase())

//loai bo giau cach thua 
console.log(myString.trim())

//TACH STRING THANH ARRAY
var languages = 'Javascript,PHP,Ruby';
console.log(myString.split(', '))

const myString2 = 'Son Dang'
console.log(myString2.charAt(0))


/**
 * NUMBER
 * 
 * To string 
 * to Fixed 
 */

var age =18
var PI = 3.14
console.log(age.toString(age))

console.log(PI.toFixed())//3-string

//ARRAYS
/**
 * 1. to string
 * 2. join
 * 3. pop
 * 4. push 
 * 5.shift 
 * 6.unshift
 * 7.splicing 
 * concat
 * slicing
 */

var languages =[
    'java',
    'PHP',
    'Ruby'
]

//chuyen sang kieu string 
console.log(languages.toString())
//java,php,ruby

console.log(languages.join(' , '))
//java , php , ruby

//lay va tra ve phan tu o dau 
console.log(languages.shift())

//them phan tu vao dau mang
console.log(languages.unshift('dart','c'))

//xoa phan tu
languages.splice(1,1)
//java ,ruby

//chen phan tu 
languages.splice(1,0,'dart')
//java dart php ruby

var languages2 = [
    'c',
    'c++'
]
//merge
console.log(languages.concat(languages2))


// FUNCTION
function show() { 
    alert('hi xin chap')
}

//goi ham 
alert()

//tham so 
function writeLog(mess) { 
    console.log(mess)
}

writeLog('test mess')

//Arguments 
function writeLog() { 
    console.log(arguments)
}
writeLog('log 1','log 2')
//output ; arrays 

function writeLog() { 
    var myString = ''
    for (var param of arguments) { 
        myString += `${param} - `
    }
}

//return function
var isConfirm = confirm('Mess');

console.log(isConfirm)

function cong(a,b) { 
    return a + b;
}

var res = cong(2,8)

/***
 * cac loai function :
 * 1,declaration function
 * 2. express function
 * 3.arrow function
 */ 

//Object

var emailKey = 'email'

var myInfo = {
    name: 'Son Dang',
    age: 18,
    address : 'Hanoi vietnam',
    [emailKey] : 'mikeethanh@gmail.com ',
    getName: function() { 
        return this.name;
    }
}

console.log(myInfo.getName())

console.log(myInfo)

//them key-val
myInfo.email = 'mikeethanh04@gmail.com'
//
console.log(myInfo.name)
// or 
console.log(myInfo['name'])
//delete
delete myInfo.age;

//object constructor 
 function User(firstName,LastName,avatar ) { 
    this.LastName = LastName
    this.firstName = firstName
    this.avatar = avatar

    this.getName = function() { 
        return `${this,firstName} ${this.LastName}`
    }
 }

 var user = new User('Son','Dang',"avatar");
 var user2 = new User('VU','nguyen',"avatar");

user.title = 'chia se tai f8'
user2.comment = 'lieu co khoa asp.nap k ad'

//object prototype
User.prototype.className = 'F8'
//them 1 thuoc tinh vao prototype


//doi tuong date
var date =new Date();

var year = date.getFullYear
var month = date.getMonth //+1
var day = date.getDay

console.log((`${day}/${month}/${year}` ))

//toan tu 3 ngoi : ternary operator 
var course = { 
    name: 'Javascript',
    coin : 250
}

var res = course.coin > 0 ? `${coin} coins` : 'Free'
//neu course.coin > 0 thì in ra so tien ,neu khong thi mien phi
 
//for/in
var myInfo = {
    name:'mai thanh',
    age:18,
    address:'Hn'
}

for (var key in myInfo) { 
    console.log(key)
    console.log(myInfo[key])
}

//for /of 
var languages = [
    'Javascript',
    'PHP',
    'java'
]

for (var value of languages ) { 
    console.log(value)
}

/**Arrays method
 * forEach()
 * every()
 * some()
 * find()
 * filter()
 * map()
 * reduce() 
 */

var courses = [
    {
        id:1,
        name:'javascript',
        coin:250
    },
    {
        id:2,
        name:'HTML,CSS',
        coin:0
    }, 
    {
        id:3,
        name:'Ruby',
        coin:0
    },
    {
        id:4,
        name:'PHP',
        coin:400
    },
    {
        id: 5,
        name:'ReactJS',
        coin:0
    }
]

//duyet qua
courses.forEach(function(course,index) { 
    console.log(index,course)
})

//kiem tra xem cos course nao mien phi khong
var isFree = courses.every(function(course,index) { 
    return course.coin === 0 //boolean
})

//nguoc lai voi every
var isFree = courses.some(function(course,index) {
    return course.coin === 0 
})

//luon tra ve 1 doi tuong  
var course = courses.find(function(course,index) { 
    return course.name === 'Ruby'
})

//filter khac find la tra ve tat ca phan tu 
var listCourse = courses.filter(function(course,index) { 
    return course.name === 'Ruby'
})


var newCourses = courses.map(function(course) { 
     return {
        id: course.id,
        name:`Khoa hoc: ${course.name}`,
        coin:course.coin,
        coinText: `Gia::${course.coin}`
     }
})

//reduce : 
var totalCoin = courses.reduce(function(accumulator,currentValue) { 
    return accumulator + currentValue.coin
},0)

//include():tim kiem trong array or string 
var title = 'Responsive web design'

console.log(title.includes('Responsive',1))

var course = ['java','php','dart']
console.log(course.includes('java'))

/**
 * Math object:
 * math.PI
 * math.round()//lam tron
 * math.abs()
 * math.ceil()//lam tron tren
 * math.floor()//lam tron duoi
 * math.random()
 * math.min()
 * math.max()
 */

console.log(Math.PI)


//Call back

//1.la ham 
//2.truyen qua doi so 
//duoc goi lai (trong ham nhan doi so)

Array.prototype.map2 = function(callback) { 
    arrayLength = this.length
    var output = []
    for(var i = 0 ; i < arrayLength;i++) { 
        var res = callback(this[i],i)
        output.push(res)
    }
    return output
}
var courses = ['java','html','css']

var html = courses.map2(function(course,index) { 
    return `<h2> ${course}</h2>` 
}) 

 
//my forEach()
var courses = ['java','php','dart']

Array.prototype.forEach = function(callback) { 
    for(var index in this ) { 
        if(this.hasOwnProperty(index)){
           callback(this[index],index,this)
        }
    }
}

courses.forEach2(function(course,index,array) { 
    console.log(course,index,array)
})


//HTML DOM 

// 1.element: ID,class,tag,css selector,html selection

//2.attribute


var headingNode = document.getElementById('heading');

var headingNodes = document.getElementsByClassName('classHeading')

//css selector
var headingNode = document.querySelector('.heading')
//lop gia 
var headingNode = document.querySelector('.box .heading2:nth-child(2)')


var listItemNodes = document.querySelectorAll('.box-1 li')

// 2.Attribute

var headingElement = document.querySelector('h1')

//addAttribute
headingElement.title = 'Heading'
//cach2 : 
headingElement.setAttribute('class','heading')

//lay ra value cua 1 atribute

headingElement.getAttribute('class')

//innerText , textContent
var headingElement = document.querySelector('.heading')

console.log(headingElement.textContent())
console.log(headingElement.innerText())
// thay do text
headingElement.innerText() = 'New heading'
//phan biet inner text va text content 



//innerHTML property
//outerHTML
var boxElement = document.querySelector('.box')
//them the h1 ,them atrbute node
boxElement.innerHTML = '<h1 title = "heading">Heading</h1>'
//geter
console.log(boxElement.innerHTML)

console.log(document.querySelector('h1').innerText)

//outer
boxElement.outerHTML = '<span>Test</span>'


//Node properties

//DOM style 
var boxElement = document.querySelector('.box')

console.log(boxElement.style)
//
boxElement.style.width = '100px'
boxElement.style.height = '200px'
boxElement.style.backgroundColor = 'red';

Object.assign(boxElement.style, { 
    width: '200px',
    height: '100px',
    backgroundColor:'green',
})

//ClassList property 

// add
//contains 
// remove 
//toggle

var boxElement = document.querySelector('.box')

console.log(boxElement.classList.length)

console.log(boxElement.classList.value)
//tra ve gia tri 

//add class 
boxElement.classList.add('red','green')

//check xem class co exist trong element k 
console.log(boxElement.classList.contains('red'))

//delete class
boxElement.classList.remove('red')
  
//DOM events 
//1. attribute events
//2. assign event using the element node

var h1Element = document.querySelector('h1')

h1Element.onclick = function(e) { 
    console.log(e.target) 
}

//DOM events example 

//1,input / select
//2, key up/dowm

//lay ra input cua the value va luu vao 1 bien 

var inputValue 

var inputElement = document.querySelector('input[type="text"]')

//onchange or oninput 
inputElement.onchange = function(e) { 
   inputValue =  console.log(e.target.value)
}


var inputElement = document.querySelector('input[type="checkbox"]')
inputElement.onchange = function(e) { 
    inputValue =  console.log(e.target.checked)
 }

 var inputElement = document.querySelector('select')
 inputElement.onchange = function(e) { 
     console.log(e.target.value)
 }


 //key up / down 
 var inputElement = document.querySelector('input[type="text"]')
 inputElement.onkeyup = function(e) { 
    console.log(e.which)

    switch(e.which) { 
        case 27:
            console.log('Exit')
            break
    }
  }
 


//DOM events 

//1. preventDefault
//2. stopPropagation

//lay ra the a 
var aElements = document.links

for(var i = 0 ; i < aElements.length; i++) { 
    aElements[i].onclick = function(e) { 
       
       if(!e.target.href.startsWith('http://f8.edu.vn')) { 
            e.preventDefault();
       }
       
        // console.log(e.target.href)
    } 
}

//vd 2 
var ulElement = document.querySelector('ul')

ulElement.onmousedown = function(e) {
    e.preventDefault();
}

ulElement.onclick = function(e) {
    console.log(e.target)
}

 //1. Event Listener

 //1. xu ly nhieu vien khi 1 event xay ra 
 //2. huy bo lang nghe / lang nghe 
 //lang nghe theo event listener
var btnElement = document.getElementById('btn')
btnElement.addEventListener('click',function(e) {
    console.log(Math.random())
})

//viet thep cach khac


function viec1() { 
    console.log('viec 1 ')
}
btnElement.addEventListener('click',viec1) 

setTimeout(function() { 
    btnElement.removeEventListener('click',viec1)
},3000)

//2.JSON
//JSON la 1 dinh danh du lieu (chuoi)
//Javascrip Oject Notation
// JSON : number , boolean , Null,Array , object

// ma hoa / giai ma 
//encode /decode 
// stringify(tu java sang json) / parse (tu json sang java)


var json = '1';
var json = '["java","PHP"]';
var json = '{"name":"Son dang","age": 18}'

var a = '1';

console.log(JSON.parse(a));
// no se tro thanh so 1 (number)

console.log(JSON.stringify(true));

//promise
 //sync : dong bo
 //Async: bat ddong bo 
 //Pain 
 // ly thuyet 
 //thuc hanh 

 //Sync /Async : 

 //dong bo la thang nao viet trc thi chay truoc , thang nao viet sau , chay sau
 //chay theo luong , tuan tu 

//Async: setTimeout,setInterval,fetch, xmlhttp 

//callback

//noi dau 

//callback hell 
//pyramid of doom 

setTimeout(function(){
    console.log(1);
    setTimeout(function(){
        console.log(1);
        setTimeout(function(){
            console.log(1);
            setTimeout(function(){
                console.log(1);
                
            },1000)
        },1000)
    },1000)
},1000)

//ly thuyet , va cach hoat dong 

//khoi tao promise
//viet ra executor 

//1.Pending 
//2. fullfilled
//3. reject

var promise = new Prmise(
    //Executor
    function(resolve, reject) {
        // logic 
        // thanh cong : resolve()
        //that bai: reject()

        //fake call api
        resolve([
            {
                id: 1,
                name: 'Javascrip',
            }
        ]);
        
        //fake call API
        reject('Co loi');
    }
)  

promise
    .then(function(course) {
        console.log(course)
    })
    .catch(function(error) {
        console.log(error);
    })
    .finally(function() {
        console.log('done')
    })


//promise chain
var promise = new Promise(

    function (resolve , rerject) {

        resolve();
    }
)

promise
    .then(function() {
        return 1;
    })
    .then(function(data) {
        console.log(data);
        return 2;
    })
    .then(function(data) {
        console.log(data)
        return 3;
    })
    .then(function(data) {
       console.log(data)
    })

promise 
    .then(function() {
        return new Promise(function(resolve) {
            setTimeout(function() {
                resolve([1,2,3])
            },3000)
        }) 
    })
    .then(function(data) {
        console.log(data);
    })

// bai toan ban dau 
function sleep(ms) {
    return new Promise(function(resolve) {
        setTimeout(resolve,ms);
    })
}

sleep(1000)
    .then(function() {
        console.log(1);
        return sleep(1000);
    })
    .then(function() {
        console.log(2);
        return sleep(1000);
    })
    .then(function() {
        console.log(3);
        return sleep(1000);
    })
    .then(function() {
        console.log(4);
        return sleep(1000);
    })


//promise methods (resolve , reject , all) 
function sleep(ms) {
    return new Promise(function(resolve) {
        setTimeout(resolve,ms);
    })
}

sleep(1000)
    .then(function() {
        console.log(1);
        return sleep(1000);
    })
    .then(function() {
        console.log(2);
        return new Promise(function(reslove , reject) {
            reject('co loi');
        })
    })
    .then(function() {
        console.log(3);
        return sleep(1000);
    })
    .then(function() {
        console.log(4);
        return sleep(1000);
    })
    //bat loi 
    .catch(function(error) {
        console.log(error);
    })


//1 promise.resolve
//2 promise. reject
//3 promise.all

// thu vien: output luon luon la 
// mot promise
var promise = new Promise(function(resolve,rerject) {
    // logic
    resolve('Success')
    rerject('fail')
})

//tao nhanh 
var promise = Promise.resolve('Success')


promise
    .then(function (result) {
        console.log('result: ',result)
    })
    .catch(function(error) {
        console.log(error);
    })

//promise.all
var promise1 = new Promise(function(resolve,reject) {
    setTimeout(function() {
        resolve([1])
    },2000)
})

var promise2 = new Promise(function(resolve,reject) {
    setTimeout(function() {
        resolve([2,3])
    },5000)
})
//hop nhat 2 mang 
Promise.all([promise1,promise2])
    .then(function(result) {
        var result1 = result[0];
        var result2 = result[1] 

        console.log(result1.concat(result2))
       })

//1, Var / Let,Const: Scope , Hosting
//2. Const / Var , Let: Assignment 

//Code block: if else , loop , {}, ....


var a = 1 ; 

//arrow function 
const logger = (log)=> {
    console.log(log)
}

log('Message..')

//
const sum = (a,b) => a+b

console.log(sum(2,2))

//
const course = {
    name: 'javascript',
    getName: function() {
        return this.name; //CONTEXT
    }
}

//TEMPLATE LITERALS (TEMPLATE STRING)
const courseName = 'Java';
const description = 'Course name: ${courseName}' 

console.log(description);

const lines = 'Line 1 \n Line 2 '

//tabnine 

//class 
function Course(name,price) {
    this.name = name;
    this.price = price;
}

//class 
class Course {
    constructor(name,price) {
        this.name = name;
        this.price = price;
    }

    getName() {
        return this.name;
    }

    getPrice() {
        return this.price;
    }

    run() {
        const isSuccess = false;
    }
}

const phpCourse = new Course('PHP',1000)
const jsCourse = new Course('Java',2000)

//1 dinh nghia key : value cho object 
//2 dinh nghia method cho object 
//3 dinh nghia key cho object

var name = 'javascript'
var price = 1000

var course = {
    name,
    price,
}

function logger(log, isAlert = false) {
    if(isAlert) return alert(log);
}

logger('Message...',true);

//destructuring 
var array = ['java','php','ruby']

var a = array[0];
var b = array[1];
var c = array[2];

//destructuring 
var [a, ,c] = array;
// lay ra 3 phan tu trong array

//rest parameters
//lay ra cac phan tu con lai trong array
var [a,...rest] = array

var course = {
    name: 'java',
    price: 1000
}

//destructuring
var {name,price} = course

var {name, ... newObject} = course

console.log(newObject)

//
var course = {
    name: 'java',
    price: 1000,
    children : {
        name: 'ReaacJS',
    }
}

var {name: parentName , children: {nameLchildrenName} } = course

console.log(parentName,name)
console.log(childrenName)


//spread (...)
var array = ['java', 'ReaacJS', 'ruby']

var array2 = ['dart','php']

var array3 = [...array2, ...array]

var object1 = {
    name: 'java',
}

var object2 = {
    price: 200
}

var object2 = {
    ...object1,
    ...object2
}


var array = ['java', 'ReaacJS', 'ruby']

function logger(a,b,c) {
    console.log(a,b,c);
}

logger(...array)

//tagged template literals
function highlight([first , ...strings],...values) {
    return values.reduce(
        (acc,curr) => [...acc, `<span> ${curr} </span>`],string.shift(),[first]
    ) 
}
var brand = 'f8'
var course = 'java'
const html = highlight `hoc lap trinh ${course} tai ${brand}` 

console.log(html);

import { TYPE_LOG, TYPE_WARN } from "./logger";
//modules: import / export

import logger,  {TYPE_LOG,TYPE_WARN} from './logger.js'

logger('Test message','warn')

//optional chaining (?.)
const adventurer = {
    name: 'Alice',
    cat: {
      name: 'Dinah',
    },
    cat2: {
        name: 'Dinah',
      },
      cat3: {
        name: 'Dinah',
      },
};

if(
    //optional chaining (?.)
    adventurer?.cat?.cat1?.cat2?.name
)
console.log(adventurer.cat.cat1.cat2.name);


//fetch : lay du lieu tu phia back-end tra ve

//api {url} : application programing interface

// cong giao tiep giua cac phan mem 

//back-end -> api ->fetch -> JSON/XML 
//->JSON.parse -> JavaScript types 
// -> render ra giao dien voi html

var postAPI = 'https://jsonplaceholder.typicode.com/posts'

// stream
fetch(postAPI)
    .then(function(response){
        return response.json()
        //JSON.parse JSON -> javascript 
    }) 
    .then (function(posts) {
        var htmls = posts.map(function(post){
            return `<li>
                <h2>${post.title}</h2> 
                <p>${post.body}</p>
            </li>`;
        }) 
        var html = htmls.join('')
        document.getElementById('post-block').innerHTML = html
    })

   
//promise example :

var users = [
    {
        id: 1,
        name: "Kien dang",

    },
    {
        id: 2,
        name: "Son dang",
    },
    {
        id: 3,
        name: "hung dam",
    }
]

var comments = [
    {
        id:1,
        user_id:1,
        content: "Kien dang",
    },
    {
        id:2,
        user_id:2,
        content: "Kien dang",
    }
]

//1. lay comments
//2 tu comment lay ra used_id 
//3. tu user_id lay ra user tuong ung 

//fake api: mo phong 1 cai ham goi url 
function getComments() {
    return new Promise(function(resolve,reject) {
        setTimeout(function() {
            resolve(comments)
        },1000)
    })
}

function getUsersByIds(userIds) {
    return new Promise(function(resolve,reject) {
        var result = user.filter(function(user) {
            return userIds.includes(user.id)
        })
        setTimeout(function() {
            reslove(result)
        },1000)
    },1000)
} 

getComments()
.then(function(comments) {
    var userIds = comments.map(function() {
        return comments.user_id;
    })

    return getUsersByIds(userIds) 
        .then(function(users) {
            return {
                users: users,
                comments: comments,
            };
    })
    .then(function(data) {
        console.log(data);
    })
})


// JSON server: API Server (fake ra duoc 1 cais api server)


var courseAPI = 'http://localhost:3000/courses'

fetch(courseAPI)
   .then(function(response) {
        return response.json()
    })
    .then(function(course) {
        console.log(course)
    })


//Mock API
//Postman
// CRUD 
    //create-> POST
    //read -> GET 
    //update -> PUT
    //delete => DELETE

