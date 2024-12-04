<script setup lang="ts">
import ThemoviePage from './components/ThemoviePage.vue'
</script>

<template>
  <header>
    <img alt="Two people moviening" class="logo" src="./assets/moviening1.png" width="125" height="125" />

    <div class="wrapper">
      <ThemoviePage movie="moviening is the best" />
    </div>
    
  </header>


</template>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
