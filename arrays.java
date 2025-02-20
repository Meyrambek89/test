function myFunction(a, n) {
    return a[n];
}

function myFunction2(a) {
    return a.slice(3);
}

function myFunction3(a) {
    return a.slice(-3);
}

function myFunction4(a) {
    return a.slice(0, 3);
}

function myFunction5(a, n) {
    return a.slice(-n);
}

function myFunction6(a, b) {
    return a.filter(x => x !== b);
}

function myFunction7(a) {
    return a.length;
}

function myFunction8(a) {
    return a.filter(x => x < 0).length;
}

function myFunction9(a) {
    return a.sort();
}

function myFunction10(a) {
    return a.sort((x, y) => y - x);
}

function myFunction11(a) {
    return a.reduce((sum, num) => sum + num, 0);
}

function myFunction12(a) {
    return a.length ? a.reduce((sum, num) => sum + num, 0) / a.length : 0;
}

function myFunction13(a) {
    return a.reduce((longest, current) => current.length > longest.length ? current : longest, "");
}

function myFunction14(a) {
    return a.every(el => el === a[0]);
}

function myFunction15(...arrays) {
    return arrays.flat();
}

function myFunction16(a) {
    return a.sort((x, y) => x.b - y.b);
}

function myFunction17(a, b) {
    return [...new Set([...a, ...b])].sort((x, y) => x - y);
}

function myFunction18(a, b) {
    return a.filter(num => num > b).reduce((sum, num) => sum + num, 0);
}
