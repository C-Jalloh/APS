<template>
<body>
    <div class="main-container">
        <div class="container">
        <div class=" box username">{{ Username }}</div>
        <div class=" box email">{{ email }}</div>
        <div class=" box profile">
            <a href="#" rel="noopener noreferrer">Profile</a>
        </div>
        <div class="box watchlist">
            <a href="#" rel="noopener noreferrer">Watch List</a>
        </div>
        <div class="box notification">
            <a href="#" rel="noopener noreferrer">Notification</a>
        </div>
        <div class="box settings">
            <a href="#" rel="noopener noreferrer">Settings</a>
        </div>
    </div>
    </div>

</body>
</template>

<script>
export default {

}
</script>

<style>
    body{
        height: 100vh;
        width: 100vw;

    }
    a{
        text-decoration: none;
    }
     .main-container {
        height:100%;
        width: 100%;
        background-color: gray;
        display: flex;
        justify-content: center;
        align-items: center
}
    .container {

        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        background-color: rgb(195, 204, 212);
        height: 60vh;
        width: 30vw;
        border-radius: 5%;

    }
    .box{
        height: 8vh;
        width: 26vw;
        margin: 1vh 2vw 1vh 2vw;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 3em;
        text-decoration: none;
        border: 2px solid black;
        background-color: aliceblue;
    }

</style>
