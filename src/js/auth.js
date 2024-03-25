const authSwitch = document.getElementById("switchLoginRegister");
const main = document.querySelector('main');

const switchText = [
    ['Еще нет аккаунта?', 'Зарегистрироваться'],
    ['Уже есть аккаунт?', 'Войти']
]

let switching = false;

function switchingCooldown(){
    switching = true;
    setTimeout(() => {
        switching = false;
    }, 1000);
}

const switchBtn = authSwitch.querySelector('button');
const switchTextElem = authSwitch.querySelector('p');

switchBtn.addEventListener('click', () => {
    if(!switching){
        if(main.getAttribute('data-switch') == 1){
            main.setAttribute('data-switch', 0);
            switchTextElem.innerText = switchText[0][0];
            switchBtn.innerText = switchText[0][1];
            switchingCooldown();
            return;
        }
        main.setAttribute('data-switch', 1);
        switchTextElem.innerText = switchText[1][0];
        switchBtn.innerText = switchText[1][1];
        switchingCooldown();
    }
})