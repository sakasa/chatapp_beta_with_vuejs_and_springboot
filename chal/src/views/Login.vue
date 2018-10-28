<template>
  <div class="top">
    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
      <Header :name="name" />
      <main class="mdl-layout__content mdl-grid">
        <div class="page-content">
          <h1>Chal</h1>
          <div>
            <UserForm/>
            <button id="in_button" 
              class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-cell"
              @click="click()">
              はいる
            </button>
          </div>
          <div class="mdl-cell">&nbsp;</div>
          <div>
            <a href="/regist" class="mdl-button mdl-js-button mdl-button--primary">とうろく</a>
          </div>
          <div class="mdl-cell">&nbsp;</div>
          <div>
            <a href="/top" class="mdl-button mdl-js-button mdl-button--primary">とっぷ</a>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script>
import router from '@/router';
import UserForm from '@/components/UserForm.vue'; // @ is an alias to /src
import Header from '@/components/Header.vue';

export default {
  name: 'Login',
  components: {
    UserForm,
    Header,
  },
  methods: {
    click() {
      /*
      TODO
      ・validate
      ・sign in
      */
      router.push('chat');
    },
  },
  data() {
    return {
      name: 'Login',
    };
  },
};
</script>
