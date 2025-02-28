// 1. Escribe un comentario en una línea

// Primer Comentario

// 2. Escribe un comentario en varias líneas

/* 
    Primer Comentario de varias Lineas
*/

// 3. Declara variables con valores asociados a todos los datos de tipo primitivos

let miString = "Nombre";
let miNumber = 34;
let miBoolean = true;
let miUndefined;
let miNull = null;
let miSymbol = Symbol("Nuevo Symbol");
let newBigint = 4325676574747898543567897098767543576n;

// 4. Imprime por consola el valor de todas las variables
console.log(miString);
console.log(miNumber);
console.log(miBoolean);
console.log(miUndefined);
console.log(miNull);
console.log(miSymbol);
console.log(newBigint);

// 5. Imprime por consola el tipo de todas las variables

console.log(typeof miString);
console.log(typeof miNumber);
console.log(typeof miBoolean);
console.log(typeof miUndefined);
console.log(typeof miNull);
console.log(typeof miSymbol);
console.log(typeof newBigint);

// 6. A continuación, modifica los valores de las variables por otros del mismo tipo

miString = "Apellido";
miNumber = 2.5;
miBoolean = false;

// 7. A continuación, modifica los valores de las variables por otros de distinto tipo

miNull = "Ya no es nulo";
miUndefined = 5;
miSymbol = false;

console.log(typeof miNull);
console.log(typeof miUndefined);
console.log(typeof miSymbol);

// 8. Declara constantes con valores asociados a todos los tipos de datos primitivos

const miString2 = "Nombre";
const miNumber2 = 34;
const miBoolean2 = true;
const miNull2 = null;
const miSymbol2 = Symbol("Nuevo Symbol");
const newBigint2 = 4325676574747898543567897098767543576n;

// 9. A continuación, modifica los valores de las constantes

miString2 = "Edad";
miNumber2 = 44;
miBoolean2 = false;

console.log(miString2); // Da Error
console.log(miNumber2); // Da Error
console.log(miBoolean2); // Da Error

// 10. Comenta las líneas que produzcan algún tipo de error al ejecutarse
