package com.music.player.wakili.cool.trackInfo.models

/*
model to return to activity for showing track info
 */
enum class RESULT{
    POSITIVE, NEGATIVE
}

class TrackInfo{

    var track: com.music.player.wakili.cool.trackInfo.models.track.Track? = null
    var album: com.music.player.wakili.cool.trackInfo.models.album.Album? = null
    var similarTracks: com.music.player.wakili.cool.trackInfo.models.similar.Similartracks? = null

    interface Callback {
        fun onTrackInfoReady(trackInfo: TrackInfo)
    }

    var result = RESULT.POSITIVE

    override fun toString(): String {
        return "Track : ${track?.name} \n " +
                "Artist : ${track?.artist} \n" +
                "Album : ${track?.album} \n" +
                "Album info available : $album \n" +
                "Similar track : $similarTracks"
    }
}



