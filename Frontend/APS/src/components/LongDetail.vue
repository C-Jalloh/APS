<template>
<body>
    <div class="container1">
        <div class="container2">
            <div class="img-div">
                <img class="img" src="../assets/running1.png" alt="">
            </div>
            <div class="description-div">
                <div class="description title">
                    <p>Avengers Endgame</p>
                </div>
                <div class="description rating">
                    Rating
                </div>
            </div>
        </div>
    </div>

</body>
</template>

<script lang="ts">
export default {

}
</script>

<style>
body {
        background-color: bisque;
        border: 3px solid black;
        height: 100%;
        width: 100%;
        margin: 0%;
        padding: 0%;
    }

    .container1 {
        background-color: rgb(172, 169, 166);
        border: 3px solid rgb(248, 16, 16);
        height: 97vh;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }

    .container2 {
        display: flex;
        flex-direction: row;
        height: auto;
        width: 30vw;
        padding-bottom: 10px;
        border-bottom: 2px solid black;
    }

    .img-div {

        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;

    }

    .description-div {
        display: flex;
        flex-direction: column;
        justify-content: center;
        /* align-items: center; */
        width: 100%;
    }

    .img {
        height: 10vh;
        width: 10vw;
    }
    .title{
        padding-left: 10px;
        font-size: 30px;
        margin: 5px;
    }
    .rating{
        padding-left: 10px;
        font-size: 20px;
        margin: 5px;
    }
    p{
        margin: 0%;
        padding: 0%;
    }
</style>
