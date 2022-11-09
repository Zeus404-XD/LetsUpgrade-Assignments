console.log("Program Start");
let array = [10,43,67,69,21,89,56,76];
const len = array.length;
let bigNum = array[0];
for( var i = 1; i<len ; i++){
	console.log(array[i]);
	if(array[i]>bigNum){
		bigNum = array[i]
	}
}
console.log("The biggest no of the elements is",bigNum);