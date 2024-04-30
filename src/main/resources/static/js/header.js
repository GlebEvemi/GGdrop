const mobMenuBtn = document.getElementById('mobMenuBtn');
const header = document.querySelector('header');
mobMenuBtn.addEventListener('click', () => {
    if(header.classList.contains('opened')){
        header.classList.remove('opened');
        return;
    }
    header.classList.add('opened');
})

const balance = document?.getElementById('balance');
if(balance){
    balance.innerText = Number(balance.innerText).toFixed(2);
}