
console.log(CLBK)
const mymicds = new MyMICDS.MyMICDS();

function loginCheck() {
    console.log('loginCheck')
    if (mymicds.auth.isLoggedIn === false) {
        location.href = '/src/main/Ressources/HTML/login.html'
        alert('ERROR : You are not a Administrator')
        console.log("loginCheck Failed")
    }
}
function adminCheck() {
    console.log('adminCheck')
    if (mymicds.auth.snapshot.scopes.admin === false) {
        location.href = '/src/main/Ressources/HTML/login.html'
        alert('Pretty sure you need to be an admin to go here.')
        console.log('adminCheck Failed')
    }

}
