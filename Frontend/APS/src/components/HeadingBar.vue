<template>

<body>
    <div class="container1">
        <div class="container2">
            <div class="container3">
                <div class="side">
                    <p>Close Menu
                    </p>
                </div>
                <div class="side">
                    <p>Home</p>
                </div>
                <div class="side">
                    <p>Top 10</p>
                </div>
                <div class="side">
                    <p>Top 20</p>
                </div>
                <div class="side">
                    <p>Movies</p>
                </div>
                <div class="side">
                    <p>Series</p>
                </div>
                <div class="side">
                    <p>Genre</p>
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
    .container1 {
        height: 60vh;
        width: 20vw;
        /* border: 2px solid black; */


    }

    .container2 {
        /* border: 2px solid rgb(255, 0, 0); */
        height: 60vh;
        width: 20vw;
    }

    .container3 {
        /* border: 2px solid rgb(146, 57, 57); */
        display: flex;
        flex-direction: column;
        padding-top: 20px;
        height: 56vh;
        width: 20vw;
    }

    .side {
        height: 8vh;
        width: 20vw;
        border-bottom: 0.5px solid rgb(0, 0, 0);
        margin: 0px 5px;
    }


    .genre-text {
        width: 20vw;
    }



    .genres {
        padding: 0px;
        margin: 0px;
        justify-content: center;
        align-items: center;
        border: 0.25px solid black;
    }

    .genre:hover {
        filter: blur(1px);
    }
</style>
