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
        if(char==='[' || char==='{' || char==='('){
           stack.push(char)
        }else if(char=='}' && mappedchar==char || char==']' && mappedchar==char ||char==')' && mappedchar==char){
            stack.pop()
        }else{
            return false 
        }
    }
    return stack.length==0
};
    