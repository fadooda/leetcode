/**
 * @param {string} s
 * @return {boolean}
 */
function charMap(char){
    if(char==='{')
    {
        return '}'
    }else if (char==='[')
    {
        return ']'
    }else if (char==='(')
    {
        return ')'
    }
}



/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack=[]
    for(let index=0; index < s.length;index++){
        let char=s.charAt(index)
        let peepchar=stack[stack.length-1]
        let mappedchar=charMap(peepchar)
        if(char!=mappedchar){
           stack.push(char)
        }else {
            stack.pop()
        }
    }
    return stack.length==0
};
    