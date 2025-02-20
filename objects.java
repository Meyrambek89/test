function myFunction(a, b) {
    return a + b;
}

function myFunction2(a, b){
    return a===b;
}

function myFunction3(a){
    return typeof a;
}

function myFunction4(a, n) {
    return a.charAt(n - 1);
}

function myFunction5(a) {
    return a.slice(3);
}

function myFunction6(a) {
    return a.slice(-3);
}

function myFunction7(a) {
    return a.slice(0, 3);
}

function myFunction8(a) {
    return a.indexOf("is");
}

function myFunction9(a) {
    return a.slice(0, Math.floor(a.length / 2));
}

function myFunction10(a) {
    return a.slice(0, -3);
}

function myFunction11(a, b) {
    return (a * b) / 100;
}

function myFunction12(a, b, c, d, e, f) {
    return Math.pow(((a + b - c) * d) / e, f);
}

function myFunction13(a, b) {
    return a.includes(b) ? b + a : a + b;
}

function myFunction14(num) {
    return num % 2 === 0;
}

function myFunction15(a, b) {
    return b.split(a).length - 1;
}

function myFunction16(a) {
    return Number.isInteger(a);
}

function myFunction17(a, b) {
    return a < b ? a / b : a * b;
}

function myFunction18(a) {
    return Number(a.toFixed(2));
}

function myFunction19(a) {
    return a.toString().split("").map(Number);
}

function myFunction20(a, b) {
    return a + b;
}
