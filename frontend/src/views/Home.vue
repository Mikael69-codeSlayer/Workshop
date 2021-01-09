<template>
  <h1>Home page</h1>
  
   <div 
    v-for="poke of pokemon" 
   :key="poke.id"
   >

   <router-link :to="'/details/' + poke.id">
        <img :src="poke.imageUrl">
    </router-link>
   <p>#{{ poke.number }} {{ poke.name }}</p>
    </div>
</template>

<script>
export default {
    data() {
      return {
        imageUrl: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png"
      }
    }, 
    computed: {
      pokemon() {
        return this.$store.state.pokemon
      }
    }
}
</script>

<style scope>
img {
  max-width: 300px;
}
</style>