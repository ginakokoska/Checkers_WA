<template>
  <gamecontainer/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import Gamecontainer from "../../../../../../../checkers-vue/checkers-vue/checkers_vue/src/components/gamecontainer";

export default {
  name: 'App',
  components: {
    Gamecontainer,

    input,
    navbar,
    home
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
