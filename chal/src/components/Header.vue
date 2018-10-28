<template>
  <header class="mdl-layout__header">
    <div class="mdl-layout__header-row">
      <!-- Title -->
      <span class="mdl-layout-title">{{ name }}</span>
    </div>
  </header>
</template>

<script>
export default {
  name: 'Header',
  props: [ 'name' ],
};
</script>
