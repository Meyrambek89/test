function myFunction(obj) {
    return obj.country;
}

function myFunction2(obj) {
    return obj["prop-2"];
}

function myFunction3(obj, key) {
    return obj[key];
}

function myFunction4(a, b) {
    return a.hasOwnProperty(b);
}

function myFunction5(a, b) {
    return Boolean(a[b]);
}

function myFunction6(str) {
    return { key: str };
}

function myFunction7(a, b) {
    return { [a]: b };
}

function myFunction8(a, b) {
    return Object.fromEntries(a.map((key, index) => [key, b[index]]));
}

function myFunction9(a) {
    return Object.keys(a);
}

function myFunction10(obj) {
    return obj?.a?.b;
}

function myFunction11(a) {
    return Object.values(a).reduce((sum, value) => sum + value, 0);
}

function myFunction12(obj) {
  const { b, ...rest } = obj;
    return rest;
}

function myFunction13(obj1, obj2) {
  const { b, ...rest } = obj2;
    return { ...obj1, ...rest, d: b };
}

function myFunction14(a, b) {
    return Object.fromEntries(
            Object.entries(a).map(([key, value]) => [key, value * b])
  );
}

function myFunction15(obj) {
    return Object.fromEntries(
            Object.entries(obj).map(([key, value]) => [value, key])
  );
}

function myFunction16(obj) {
    return Object.fromEntries(
            Object.entries(obj).map(([key, value]) => [key, value.trim() === "" ? null : value])
  );
}

function myFunction17(obj) {
    let result = {};
    if (obj.firstName) result.firstName = obj.firstName;
    if (obj.lastName) result.lastName = obj.lastName;
    if (obj.size) result.size = obj.size + " cm";
    if (obj.weight) result.weight = obj.weight + " kg";
    return result;
}