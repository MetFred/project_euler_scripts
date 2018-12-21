let r = 0;
let a = 1;
let b = 2;
while (a <= 4000000) {
    if (a % 2 == 0)
        r += a;
    b = a + b;
    a = b - a;
}
console.log(r);
