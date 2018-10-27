<template>
  <div class="top">
    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header mdl-cell">
      <header class="mdl-layout__header"></header>
      <main class="mdl-layout__content mdl-grid">
        <div class="page-content">
          <h1>Chal</h1>
          <div>
            <button id="use_button" 
              class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored"
              @click="click()">
              つかう
            </button>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script>
import router from '@/router';
export default {
  name: 'Top',
  methods: {
    click() {
      router.push('login')
    }
  }
}
</script>