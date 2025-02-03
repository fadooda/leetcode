/**
 * @param {any} val
 * @return {Object}
 */
var expect = function(val) {
    const throwError = (condition, message) => {
        if (!condition) throw new Error(message);
        return true;
    };

    return {
        toBe(compare_val) {
            return throwError(val === compare_val, "Not Equal");
        },
        notToBe(compare_val) {
            return throwError(val !== compare_val, "Equal");
        }
    };
};

/**
 * Example usage:
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
