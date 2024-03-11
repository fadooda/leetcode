/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack=[]
    let parmap= new Map([
  ['{', '}'],
  ['[', ']'],
  ['(', ')']
]);
    for(let index=0; index < s.length;index++){
        let char=s.charAt(index)
        let peepchar=stack[stack.length-1]
        if(char!=parmap.get(peepchar)){
           stack.push(char)
        }else {
            stack.pop()
        }
    }
    return stack.length==0
};
