import { createStore } from 'vuex'

const state = {
    pokemon: []
}

// mutates state 
const mutations = {
    setPokemon(state, list) {
      state.pokemon = list
    }
}

// async network requests 
const actions = {
    async fetchPokemon(store) {
        let list = await fetch('/rest/pokemon')
        list = await list.json()

        // debug list
        console.log(list)

        store.commit('setPokemon', list)
    }
}

export default createStore({ state, mutations, actions })