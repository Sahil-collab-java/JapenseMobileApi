// Sidebar DropDown

const allDropDown = document.querySelectorAll('#sidebar .side-dropdown');
const sidebar = document.getElementById("sidebar")


allDropDown.forEach(item => {
  const a = item.parentElement.querySelector('a:first-child');
  // console.log(a)
  a.addEventListener('click', function (e) {
    e.preventDefault()

    if (!this.classList.contains('active')) {
      allDropDown.forEach(i => {
        const aLink = i.parentElement.querySelector('a:first-child');
        aLink.classList.remove('active')
        i.classList.remove('show')
      })
    }

    this.classList.toggle('active')
    item.classList.toggle('show')
  })
})



sidebar.addEventListener('mouseleave', function () {
  if (this.classList.contains('hide')) {
    allDropDown.forEach(item => {
      const a = item.parentElement.querySelector('a:first-child');
      a.classList.remove('active')
      item.classList.remove('show')
    })
  }
})


const profile = document.querySelector('.navcont .profile');
const imgProf = profile.querySelector('.profimg')
const dropdownProfile = profile.querySelector('.profile-link')

imgProf.addEventListener('click', function (e) {
  e.stopPropagation(); // Prevent the click event from propagating to the window
  dropdownProfile.classList.toggle('show');
  // Hide the message dropdown if it's open
  const message = document.querySelector('.navcont .message');
  const dropdownMsg = message.querySelector('.msg-link');
  if (dropdownMsg.classList.contains('show')) {
    dropdownMsg.classList.remove('show');
  }
});



// Sidebar Collaspse
const toggleSidebar = document.querySelector('.navcont .toggle-sidebar');

toggleSidebar.addEventListener('click', function () {
  sidebar.classList.toggle('hide')
})



// tabs switch toggle

const allLinks = document.querySelectorAll(".tabs a")

allLinks.forEach((elem) => {
  elem.addEventListener("click", function () {
    const hrefLinkClick = elem.href;

    allLinks.forEach((link) => {
      if (link.href == hrefLinkClick) {
        link.classList.add("active")
      } else {
        link.classList.remove("active")
      }
    })
  })
})


// Scroll navbar box shadow
var navbar = document.querySelector('.navcont');

// Function to toggle the 'scrolled' class based on scroll position
function toggleNavbarShadow() {
  if (window.scrollY > 0) {
    navbar.classList.add('scrolled');
  } else {
    navbar.classList.remove('scrolled');
  }
}

// Add scroll event listener to window
window.addEventListener('scroll', toggleNavbarShadow);

// Initial check in case the page is already scrolled when loaded
toggleNavbarShadow();




// view image from image upload

const dropArea = document.getElementById("drop-area");
const inputFile = document.getElementById("input-file");
const imgView = document.getElementById("img-view");


inputFile.addEventListener("change", uploadImage);

function uploadImage(){
  let imgLink = URL.createObjectURL(inputFile.files[0]);
  imgView.style.backgroundImage = `url(${imgLink})`
  imgView.textContent = "";
  imgView.style.border = 0
}

dropArea.addEventListener("dragover", function(e){
  e.preventDefault()
})

dropArea.addEventListener("drop", function(e){
  e.preventDefault()
  inputFile.files = e.dataTransfer.files;
  uploadImage()
})