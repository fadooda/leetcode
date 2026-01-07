/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    console.log(arr);
    const deepFlatten = (arr) => arr.flat(n);
    return deepFlatten(arr)
};