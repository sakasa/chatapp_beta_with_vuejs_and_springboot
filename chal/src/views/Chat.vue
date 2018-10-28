<template>
  <div class="chat">
    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
      <Header :name="name" />
      <main class="mdl-layout__content mdl-grid">
        <div class="page-content">
        </div>
      </main>
    </div>
  </div>
</template>

<script>
import Header from '@/components/Header.vue';

export default {
  name: 'Chat',
  components: {
    Header,
  },
  data() {
    return {
      name: 'Chat',
    };
  },
};
</script>
