const app = Vue.createApp({})


app.component('navbar',  {
    data() {
        return {
            homeLink: "/",
            instructionsLink: "/instructions",
            smallGridLink: "/new8Grid",
            bigGridLink: "/new10Grid"
        }
    },

    template: `
  <nav class="navbar navbar-dark bg-dark fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://localhost:9000/"> <i class="fa-solid fa-chess"></i> Checkers</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Checkers Menu</h5>
        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
          <li class="nav-item">
            <a class="nav-link" aria-current="page" :href="homeLink"> <i class="fa-solid fa-igloo"></i> Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="https://github.com/ginakokoska/Checkers_WA"> <i class="fa-brands fa-github-alt"></i> GitHub</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#" @click="$root.newBoard(8)"><i class="fa-solid fa-chess-queen"></i> 8x8</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#" @click="$root.newBoard(10)"><i class="fa-regular fa-chess-queen"></i> 10x10</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#" :href="instructionsLink"> <i class="fa-solid fa-clipboard-list"></i> User Manual</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>
    `
})



app.component('gamecontainer', {
    template: `
    <div class="gamecontainer" id="gamecontainer">
        <div class="game">
             <li v-for="i in $root.size">
                <div class="fieldrow">
                    <li v-for="j in $root.size"> 
                        <div class="field" id="field{{i}}*$root.size+{{j}}">
                            <img class="img" id="scalar{{i}}*$root.size+{{j}}" alt=""/>
                        </div>
                    </li>
                </div>
             </li>     
        </div>
    </div>
    `
})


app.component('form-group', {
    template: `<div class="form-group" id="form-group">
        <label for="text-input"> </label>
        <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onFocus="this.placeholder = ''" input-focus-border-color="#99999">
            <div style="padding:20px"></div>
            <button v-on:click="jsMove()" type="button" class="btn bouncy"> Enter</button>
            <p id="message-field">@{message} </p>
    </div>
    `
})


app.mount('#checkers')