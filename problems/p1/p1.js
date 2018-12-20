console.log(Array.from(Array(1000).keys()).reduce((v, k) => v + (k % 3 == 0 || k % 5 == 0 ? k : 0)));
