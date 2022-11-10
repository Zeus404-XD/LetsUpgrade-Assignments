const heading = document.querySelector('h1')
console.log(heading)
var array=['green','blue','red','black','orange','purple']
let current = 0;
const fun = () => {
    console.log("the value of current before change is",current)
    heading.style.backgroundColor= array[current]
    current++;
    if(current==array.length){
        current = 0
    }
    console.log("the value of current after change is",current)
};
const button = document.querySelector('button');
button.addEventListener('click',fun);
