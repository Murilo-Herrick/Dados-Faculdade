const input_tel_fixo=document.getElementById("tel_fixo");
const input_user_cpf = document.getElementById("user_cpf");
const intput_tel_cel = document.getElementById("tel_cel");

input_tel_fixo.addEventListener("keypress",()=>{
    let inputlength = input_tel_fixo.value.length
    
    if(inputlength == 0){
        input_tel_fixo.value += "(" 
    }else if(inputlength == 3){
        input_tel_fixo.value += ")"
    }
})

input_user_cpf.addEventListener("keypress",()=>{
    let inputlength = input_user_cpf.value.length

    if(inputlength == 3 || inputlength == 7 ){
        input_user_cpf.value += "."
    }else if (inputlength == 11){
        input_user_cpf.value += "-"
    }
})

intput_tel_cel.addEventListener("keypress",()=>{
    let inputlength = intput_tel_cel.value.length

    if(inputlength == 0){
        intput_tel_cel.value += "+55("
    }else if(inputlength == 6){
        intput_tel_cel.value += ")"
    }
})


