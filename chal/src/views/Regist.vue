<template>
  <div class="top">
    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header mdl-cell">
      <header class="mdl-layout__header"></header>
      <main class="mdl-layout__content mdl-grid">
        <div class="page-content">
          <h1>Chal</h1>
          <div class="mdl-cell">
            <!-- Simple Textfield -->
            <form action="#" class="mdl-cell">
              <div class="mdl-textfield mdl-js-textfield">
                <input class="mdl-textfield__input" type="text" id="nickname">
                <label class="mdl-textfield__label" for="nickname">Nickname (only Alpha,Numeric,_)...</label>
              </div>
              <div class="mdl-textfield mdl-js-textfield">
                <input class="mdl-textfield__input" type="password" id="pincode">
                <label class="mdl-textfield__label" for="pincode">Pincode (only Numeric)...</label>
              </div>
            </form>
            <button id="regist_button" 
              class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-cell mdl-cell--2-col"
              @click="click()">
              とうろくしてはいる
            </button>
          </div>
          <div class="mdl-cell">&nbsp;</div>
          <div class="mdl-cell">
            <a href="/login" class="mdl-button mdl-js-button mdl-button--primary">もどる</a>
          </div>
          <div class="mdl-cell">&nbsp;</div>
          <div class="mdl-cell">
            <a href="/top" class="mdl-button mdl-js-button mdl-button--primary">とっぷ</a>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script>
import router from '@/router';
export default {
  name: 'Regist',
  methods: {
    click() {
      /*
      TODO
      ・validate
      ・sign up
      */
      router.push('chat')
    }
  }
}
</script>
