function myFunction(date1, date2) {
    return date1.getTime() === date2.getTime();
}

function myFunction2(date1, date2) {
  const oneDay = 1000 * 60 * 60 * 24; // Milliseconds in one day
    return Math.abs((date1 - date2) / oneDay);
}

function myFunction3(date1, date2) {
    return date1.getFullYear() === date2.getFullYear() &&
            date1.getMonth() === date2.getMonth() &&
            date1.getDate() === date2.getDate();
}

function myFunction4(date1, date2) {
  const oneHour = 1000 * 60 * 60; // Milliseconds in one hour
    return Math.abs(date1 - date2) <= oneHour;
}

function myFunction5(a, b) {
    return a < b;
}



