package ru.avsidorov.restapitemplate.Models;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResponceTalker {
public String getPhoto(){
    return getTalk().getImages().get(0).getImage().getUrl();
}
    @Expose
    private Talk talk;

    /**
     *
     * @return
     * The talk
     */
    public Talk getTalk() {
        return talk;
    }

    /**
     *
     * @param talk
     * The talk
     */
    public void setTalk(Talk talk) {
        this.talk = talk;
    }

    public static class Ar {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Bg {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class AudioPodcast {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class Cs {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class De {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class El {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class En {

        @Expose
        private String name;
        @SerializedName("native")
        @Expose
        private Boolean _native;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The _native
         */
        public Boolean getNative() {
            return _native;
        }

        /**
         *
         * @param _native
         * The native
         */
        public void setNative(Boolean _native) {
            this._native = _native;
        }

    }

    public class Es {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Event {

        @Expose
        private Integer id;
        @Expose
        private String name;

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Fa {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Fr {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class FrCa {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Gl {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Gu {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class He {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Hi {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Hr {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Hu {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Id {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Image {

        @Expose
        private Image_ image;

        /**
         *
         * @return
         * The image
         */
        public Image_ getImage() {
            return image;
        }

        /**
         *
         * @param image
         * The image
         */
        public void setImage(Image_ image) {
            this.image = image;
        }

    }
    public class Image_ {

        @Expose
        private String size;
        @Expose
        private String url;

        /**
         *
         * @return
         * The size
         */
        public String getSize() {
            return size;
        }

        /**
         *
         * @param size
         * The size
         */
        public void setSize(String size) {
            this.size = size;
        }

        /**
         *
         * @return
         * The url
         */
        public String getUrl() {
            return url;
        }

        /**
         *
         * @param url
         * The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

    }
    public class Internal {

        @SerializedName("64k")
        @Expose
        private _64k _64k;
        @SerializedName("180k")
        @Expose
        private _180k _180k;
        @SerializedName("320k")
        @Expose
        private _320k _320k;
        @SerializedName("450k")
        @Expose
        private _450k _450k;
        @SerializedName("600k")
        @Expose
        private _600k _600k;
        @SerializedName("950k")
        @Expose
        private _950k _950k;
        @SerializedName("podcast-light")
        @Expose
        private PodcastLight podcastLight;
        @SerializedName("podcast-regular")
        @Expose
        private PodcastRegular podcastRegular;
        @SerializedName("podcast-high")
        @Expose
        private PodcastHigh podcastHigh;
        @SerializedName("audio-podcast")
        @Expose
        private AudioPodcast audioPodcast;
        @SerializedName("podcast-low-en")
        @Expose
        private PodcastLowEn podcastLowEn;
        @SerializedName("podcast-high-en")
        @Expose
        private PodcastHighEn podcastHighEn;

        /**
         *
         * @return
         * The _64k
         */
        public _64k get64k() {
            return _64k;
        }

        /**
         *
         * @param _64k
         * The 64k
         */
        public void set64k(_64k _64k) {
            this._64k = _64k;
        }

        /**
         *
         * @return
         * The _180k
         */
        public _180k get180k() {
            return _180k;
        }

        /**
         *
         * @param _180k
         * The 180k
         */
        public void set180k(_180k _180k) {
            this._180k = _180k;
        }

        /**
         *
         * @return
         * The _320k
         */
        public _320k get320k() {
            return _320k;
        }

        /**
         *
         * @param _320k
         * The 320k
         */
        public void set320k(_320k _320k) {
            this._320k = _320k;
        }

        /**
         *
         * @return
         * The _450k
         */
        public _450k get450k() {
            return _450k;
        }

        /**
         *
         * @param _450k
         * The 450k
         */
        public void set450k(_450k _450k) {
            this._450k = _450k;
        }

        /**
         *
         * @return
         * The _600k
         */
        public _600k get600k() {
            return _600k;
        }

        /**
         *
         * @param _600k
         * The 600k
         */
        public void set600k(_600k _600k) {
            this._600k = _600k;
        }

        /**
         *
         * @return
         * The _950k
         */
        public _950k get950k() {
            return _950k;
        }

        /**
         *
         * @param _950k
         * The 950k
         */
        public void set950k(_950k _950k) {
            this._950k = _950k;
        }

        /**
         *
         * @return
         * The podcastLight
         */
        public PodcastLight getPodcastLight() {
            return podcastLight;
        }

        /**
         *
         * @param podcastLight
         * The podcast-light
         */
        public void setPodcastLight(PodcastLight podcastLight) {
            this.podcastLight = podcastLight;
        }

        /**
         *
         * @return
         * The podcastRegular
         */
        public PodcastRegular getPodcastRegular() {
            return podcastRegular;
        }

        /**
         *
         * @param podcastRegular
         * The podcast-regular
         */
        public void setPodcastRegular(PodcastRegular podcastRegular) {
            this.podcastRegular = podcastRegular;
        }

        /**
         *
         * @return
         * The podcastHigh
         */
        public PodcastHigh getPodcastHigh() {
            return podcastHigh;
        }

        /**
         *
         * @param podcastHigh
         * The podcast-high
         */
        public void setPodcastHigh(PodcastHigh podcastHigh) {
            this.podcastHigh = podcastHigh;
        }

        /**
         *
         * @return
         * The audioPodcast
         */
        public AudioPodcast getAudioPodcast() {
            return audioPodcast;
        }

        /**
         *
         * @param audioPodcast
         * The audio-podcast
         */
        public void setAudioPodcast(AudioPodcast audioPodcast) {
            this.audioPodcast = audioPodcast;
        }

        /**
         *
         * @return
         * The podcastLowEn
         */
        public PodcastLowEn getPodcastLowEn() {
            return podcastLowEn;
        }

        /**
         *
         * @param podcastLowEn
         * The podcast-low-en
         */
        public void setPodcastLowEn(PodcastLowEn podcastLowEn) {
            this.podcastLowEn = podcastLowEn;
        }

        /**
         *
         * @return
         * The podcastHighEn
         */
        public PodcastHighEn getPodcastHighEn() {
            return podcastHighEn;
        }

        /**
         *
         * @param podcastHighEn
         * The podcast-high-en
         */
        public void setPodcastHighEn(PodcastHighEn podcastHighEn) {
            this.podcastHighEn = podcastHighEn;
        }

    }
    public class It {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Ja {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Ko {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Languages {

        @Expose
        private Sq sq;
        @Expose
        private ResponceTalker.Ar ar;
        @Expose
        private ResponceTalker.Bg bg;
        @SerializedName("zh-cn")
        @Expose
        private ZhCn zhCn;
        @SerializedName("zh-tw")
        @Expose
        private ZhTw zhTw;
        @Expose
        private Hr hr;
        @Expose
        private Cs cs;
        @Expose
        private Nl nl;
        @Expose
        private En en;
        @Expose
        private Fr fr;
        @SerializedName("fr-ca")
        @Expose
        private FrCa frCa;
        @Expose
        private Gl gl;
        @Expose
        private De de;
        @Expose
        private El el;
        @Expose
        private Gu gu;
        @Expose
        private He he;
        @Expose
        private Hi hi;
        @Expose
        private Hu hu;
        @Expose
        private Id id;
        @Expose
        private It it;
        @Expose
        private Ja ja;
        @Expose
        private Ko ko;
        @Expose
        private Lv lv;
        @Expose
        private Lt lt;
        @Expose
        private Rup rup;
        @Expose
        private Mk mk;
        @Expose
        private Fa fa;
        @Expose
        private Pl pl;
        @Expose
        private Pt pt;
        @SerializedName("pt-br")
        @Expose
        private PtBr ptBr;
        @Expose
        private Ro ro;
        @Expose
        private Ru ru;
        @Expose
        private Sr sr;
        @Expose
        private Sk sk;
        @Expose
        private Sl sl;
        @Expose
        private Es es;
        @Expose
        private Sw sw;
        @Expose
        private Sv sv;
        @Expose
        private Tl tl;
        @Expose
        private Th th;
        @Expose
        private Tr tr;
        @Expose
        private Uk uk;
        @Expose
        private Ur ur;

        /**
         *
         * @return
         * The sq
         */
        public Sq getSq() {
            return sq;
        }

        /**
         *
         * @param sq
         * The sq
         */
        public void setSq(Sq sq) {
            this.sq = sq;
        }

        /**
         *
         * @return
         * The ar
         */
        public ResponceTalker.Ar getAr() {
            return ar;
        }

        /**
         *
         * @param ar
         * The ar
         */
        public void setAr(ResponceTalker.Ar ar) {
            this.ar = ar;
        }

        /**
         *
         * @return
         * The bg
         */
        public ResponceTalker.Bg getBg() {
            return bg;
        }

        /**
         *
         * @param bg
         * The bg
         */
        public void setBg(ResponceTalker.Bg bg) {
            this.bg = bg;
        }

        /**
         *
         * @return
         * The zhCn
         */
        public ZhCn getZhCn() {
            return zhCn;
        }

        /**
         *
         * @param zhCn
         * The zh-cn
         */
        public void setZhCn(ZhCn zhCn) {
            this.zhCn = zhCn;
        }

        /**
         *
         * @return
         * The zhTw
         */
        public ZhTw getZhTw() {
            return zhTw;
        }

        /**
         *
         * @param zhTw
         * The zh-tw
         */
        public void setZhTw(ZhTw zhTw) {
            this.zhTw = zhTw;
        }

        /**
         *
         * @return
         * The hr
         */
        public Hr getHr() {
            return hr;
        }

        /**
         *
         * @param hr
         * The hr
         */
        public void setHr(Hr hr) {
            this.hr = hr;
        }

        /**
         *
         * @return
         * The cs
         */
        public Cs getCs() {
            return cs;
        }

        /**
         *
         * @param cs
         * The cs
         */
        public void setCs(Cs cs) {
            this.cs = cs;
        }

        /**
         *
         * @return
         * The nl
         */
        public Nl getNl() {
            return nl;
        }

        /**
         *
         * @param nl
         * The nl
         */
        public void setNl(Nl nl) {
            this.nl = nl;
        }

        /**
         *
         * @return
         * The en
         */
        public En getEn() {
            return en;
        }

        /**
         *
         * @param en
         * The en
         */
        public void setEn(En en) {
            this.en = en;
        }

        /**
         *
         * @return
         * The fr
         */
        public Fr getFr() {
            return fr;
        }

        /**
         *
         * @param fr
         * The fr
         */
        public void setFr(Fr fr) {
            this.fr = fr;
        }

        /**
         *
         * @return
         * The frCa
         */
        public FrCa getFrCa() {
            return frCa;
        }

        /**
         *
         * @param frCa
         * The fr-ca
         */
        public void setFrCa(FrCa frCa) {
            this.frCa = frCa;
        }

        /**
         *
         * @return
         * The gl
         */
        public Gl getGl() {
            return gl;
        }

        /**
         *
         * @param gl
         * The gl
         */
        public void setGl(Gl gl) {
            this.gl = gl;
        }

        /**
         *
         * @return
         * The de
         */
        public De getDe() {
            return de;
        }

        /**
         *
         * @param de
         * The de
         */
        public void setDe(De de) {
            this.de = de;
        }

        /**
         *
         * @return
         * The el
         */
        public El getEl() {
            return el;
        }

        /**
         *
         * @param el
         * The el
         */
        public void setEl(El el) {
            this.el = el;
        }

        /**
         *
         * @return
         * The gu
         */
        public Gu getGu() {
            return gu;
        }

        /**
         *
         * @param gu
         * The gu
         */
        public void setGu(Gu gu) {
            this.gu = gu;
        }

        /**
         *
         * @return
         * The he
         */
        public He getHe() {
            return he;
        }

        /**
         *
         * @param he
         * The he
         */
        public void setHe(He he) {
            this.he = he;
        }

        /**
         *
         * @return
         * The hi
         */
        public Hi getHi() {
            return hi;
        }

        /**
         *
         * @param hi
         * The hi
         */
        public void setHi(Hi hi) {
            this.hi = hi;
        }

        /**
         *
         * @return
         * The hu
         */
        public Hu getHu() {
            return hu;
        }

        /**
         *
         * @param hu
         * The hu
         */
        public void setHu(Hu hu) {
            this.hu = hu;
        }

        /**
         *
         * @return
         * The id
         */
        public Id getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Id id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The it
         */
        public It getIt() {
            return it;
        }

        /**
         *
         * @param it
         * The it
         */
        public void setIt(It it) {
            this.it = it;
        }

        /**
         *
         * @return
         * The ja
         */
        public Ja getJa() {
            return ja;
        }

        /**
         *
         * @param ja
         * The ja
         */
        public void setJa(Ja ja) {
            this.ja = ja;
        }

        /**
         *
         * @return
         * The ko
         */
        public Ko getKo() {
            return ko;
        }

        /**
         *
         * @param ko
         * The ko
         */
        public void setKo(Ko ko) {
            this.ko = ko;
        }

        /**
         *
         * @return
         * The lv
         */
        public Lv getLv() {
            return lv;
        }

        /**
         *
         * @param lv
         * The lv
         */
        public void setLv(Lv lv) {
            this.lv = lv;
        }

        /**
         *
         * @return
         * The lt
         */
        public Lt getLt() {
            return lt;
        }

        /**
         *
         * @param lt
         * The lt
         */
        public void setLt(Lt lt) {
            this.lt = lt;
        }

        /**
         *
         * @return
         * The rup
         */
        public Rup getRup() {
            return rup;
        }

        /**
         *
         * @param rup
         * The rup
         */
        public void setRup(Rup rup) {
            this.rup = rup;
        }

        /**
         *
         * @return
         * The mk
         */
        public Mk getMk() {
            return mk;
        }

        /**
         *
         * @param mk
         * The mk
         */
        public void setMk(Mk mk) {
            this.mk = mk;
        }

        /**
         *
         * @return
         * The fa
         */
        public Fa getFa() {
            return fa;
        }

        /**
         *
         * @param fa
         * The fa
         */
        public void setFa(Fa fa) {
            this.fa = fa;
        }

        /**
         *
         * @return
         * The pl
         */
        public Pl getPl() {
            return pl;
        }

        /**
         *
         * @param pl
         * The pl
         */
        public void setPl(Pl pl) {
            this.pl = pl;
        }

        /**
         *
         * @return
         * The pt
         */
        public Pt getPt() {
            return pt;
        }

        /**
         *
         * @param pt
         * The pt
         */
        public void setPt(Pt pt) {
            this.pt = pt;
        }

        /**
         *
         * @return
         * The ptBr
         */
        public PtBr getPtBr() {
            return ptBr;
        }

        /**
         *
         * @param ptBr
         * The pt-br
         */
        public void setPtBr(PtBr ptBr) {
            this.ptBr = ptBr;
        }

        /**
         *
         * @return
         * The ro
         */
        public Ro getRo() {
            return ro;
        }

        /**
         *
         * @param ro
         * The ro
         */
        public void setRo(Ro ro) {
            this.ro = ro;
        }

        /**
         *
         * @return
         * The ru
         */
        public Ru getRu() {
            return ru;
        }

        /**
         *
         * @param ru
         * The ru
         */
        public void setRu(Ru ru) {
            this.ru = ru;
        }

        /**
         *
         * @return
         * The sr
         */
        public Sr getSr() {
            return sr;
        }

        /**
         *
         * @param sr
         * The sr
         */
        public void setSr(Sr sr) {
            this.sr = sr;
        }

        /**
         *
         * @return
         * The sk
         */
        public Sk getSk() {
            return sk;
        }

        /**
         *
         * @param sk
         * The sk
         */
        public void setSk(Sk sk) {
            this.sk = sk;
        }

        /**
         *
         * @return
         * The sl
         */
        public Sl getSl() {
            return sl;
        }

        /**
         *
         * @param sl
         * The sl
         */
        public void setSl(Sl sl) {
            this.sl = sl;
        }

        /**
         *
         * @return
         * The es
         */
        public Es getEs() {
            return es;
        }

        /**
         *
         * @param es
         * The es
         */
        public void setEs(Es es) {
            this.es = es;
        }

        /**
         *
         * @return
         * The sw
         */
        public Sw getSw() {
            return sw;
        }

        /**
         *
         * @param sw
         * The sw
         */
        public void setSw(Sw sw) {
            this.sw = sw;
        }

        /**
         *
         * @return
         * The sv
         */
        public Sv getSv() {
            return sv;
        }

        /**
         *
         * @param sv
         * The sv
         */
        public void setSv(Sv sv) {
            this.sv = sv;
        }

        /**
         *
         * @return
         * The tl
         */
        public Tl getTl() {
            return tl;
        }

        /**
         *
         * @param tl
         * The tl
         */
        public void setTl(Tl tl) {
            this.tl = tl;
        }

        /**
         *
         * @return
         * The th
         */
        public Th getTh() {
            return th;
        }

        /**
         *
         * @param th
         * The th
         */
        public void setTh(Th th) {
            this.th = th;
        }

        /**
         *
         * @return
         * The tr
         */
        public Tr getTr() {
            return tr;
        }

        /**
         *
         * @param tr
         * The tr
         */
        public void setTr(Tr tr) {
            this.tr = tr;
        }

        /**
         *
         * @return
         * The uk
         */
        public Uk getUk() {
            return uk;
        }

        /**
         *
         * @param uk
         * The uk
         */
        public void setUk(Uk uk) {
            this.uk = uk;
        }

        /**
         *
         * @return
         * The ur
         */
        public Ur getUr() {
            return ur;
        }

        /**
         *
         * @param ur
         * The ur
         */
        public void setUr(Ur ur) {
            this.ur = ur;
        }

    }
    public class Lt {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Lv {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Media {

        @Expose
        private Internal internal;

        /**
         *
         * @return
         * The internal
         */
        public Internal getInternal() {
            return internal;
        }

        /**
         *
         * @param internal
         * The internal
         */
        public void setInternal(Internal internal) {
            this.internal = internal;
        }

    }
    public class Mk {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Nl {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Pl {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class PodcastHigh {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class PodcastHighEn {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }
    public class PodcastLight {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }
    public class PodcastLowEn {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }
    public class PodcastRegular {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }
    public class Pt {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class PtBr {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Rating {

        @Expose
        private Rating_ rating;

        /**
         *
         * @return
         * The rating
         */
        public Rating_ getRating() {
            return rating;
        }

        /**
         *
         * @param rating
         * The rating
         */
        public void setRating(Rating_ rating) {
            this.rating = rating;
        }

    }
    public class Rating_ {

        @Expose
        private Integer id;
        @Expose
        private String name;
        @Expose
        private Integer count;

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The count
         */
        public Integer getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(Integer count) {
            this.count = count;
        }

    }
    public class Ro {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Ru {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Rup {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Sk {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Sl {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Speaker {

        @Expose
        private Speaker_ speaker;

        /**
         *
         * @return
         * The speaker
         */
        public Speaker_ getSpeaker() {
            return speaker;
        }

        /**
         *
         * @param speaker
         * The speaker
         */
        public void setSpeaker(Speaker_ speaker) {
            this.speaker = speaker;
        }

    }
    public class Speaker_ {

        @Expose
        private Integer id;
        @Expose
        private String name;

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Sq {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Sr {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Sv {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Sw {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Tag {

        @Expose
        private String tag;

        /**
         *
         * @return
         * The tag
         */
        public String getTag() {
            return tag;
        }

        /**
         *
         * @param tag
         * The tag
         */
        public void setTag(String tag) {
            this.tag = tag;
        }

    }
    public class Talk {

        @Expose
        private Integer id;
        @Expose
        private String name;
        @Expose
        private String description;
        @Expose
        private String slug;
        @SerializedName("recorded_at")
        @Expose
        private String recordedAt;
        @SerializedName("published_at")
        @Expose
        private String publishedAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("viewed_count")
        @Expose
        private Integer viewedCount;
        @SerializedName("emailed_count")
        @Expose
        private Integer emailedCount;
        @SerializedName("commented_count")
        @Expose
        private Integer commentedCount;
        @Expose
        private Event event;
        @Expose
        private List<Image> images = new ArrayList<Image>();
        @SerializedName("image_16x9")
        @Expose
        private Boolean image16x9;
        @Expose
        private Media media;
        @Expose
        private Languages languages;
        @Expose
        private List<Tag> tags = new ArrayList<Tag>();
        @Expose
        private List<Theme> themes = new ArrayList<Theme>();
        @Expose
        private List<Speaker> speakers = new ArrayList<Speaker>();
        @Expose
        private List<Rating> ratings = new ArrayList<Rating>();

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         * The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         *
         * @return
         * The slug
         */
        public String getSlug() {
            return slug;
        }

        /**
         *
         * @param slug
         * The slug
         */
        public void setSlug(String slug) {
            this.slug = slug;
        }

        /**
         *
         * @return
         * The recordedAt
         */
        public String getRecordedAt() {
            return recordedAt;
        }

        /**
         *
         * @param recordedAt
         * The recorded_at
         */
        public void setRecordedAt(String recordedAt) {
            this.recordedAt = recordedAt;
        }

        /**
         *
         * @return
         * The publishedAt
         */
        public String getPublishedAt() {
            return publishedAt;
        }

        /**
         *
         * @param publishedAt
         * The published_at
         */
        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        /**
         *
         * @return
         * The updatedAt
         */
        public String getUpdatedAt() {
            return updatedAt;
        }

        /**
         *
         * @param updatedAt
         * The updated_at
         */
        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        /**
         *
         * @return
         * The viewedCount
         */
        public Integer getViewedCount() {
            return viewedCount;
        }

        /**
         *
         * @param viewedCount
         * The viewed_count
         */
        public void setViewedCount(Integer viewedCount) {
            this.viewedCount = viewedCount;
        }

        /**
         *
         * @return
         * The emailedCount
         */
        public Integer getEmailedCount() {
            return emailedCount;
        }

        /**
         *
         * @param emailedCount
         * The emailed_count
         */
        public void setEmailedCount(Integer emailedCount) {
            this.emailedCount = emailedCount;
        }

        /**
         *
         * @return
         * The commentedCount
         */
        public Integer getCommentedCount() {
            return commentedCount;
        }

        /**
         *
         * @param commentedCount
         * The commented_count
         */
        public void setCommentedCount(Integer commentedCount) {
            this.commentedCount = commentedCount;
        }

        /**
         *
         * @return
         * The event
         */
        public Event getEvent() {
            return event;
        }

        /**
         *
         * @param event
         * The event
         */
        public void setEvent(Event event) {
            this.event = event;
        }

        /**
         *
         * @return
         * The images
         */
        public List<Image> getImages() {
            return images;
        }

        /**
         *
         * @param images
         * The images
         */
        public void setImages(List<Image> images) {
            this.images = images;
        }

        /**
         *
         * @return
         * The image16x9
         */
        public Boolean getImage16x9() {
            return image16x9;
        }

        /**
         *
         * @param image16x9
         * The image_16x9
         */
        public void setImage16x9(Boolean image16x9) {
            this.image16x9 = image16x9;
        }

        /**
         *
         * @return
         * The media
         */
        public Media getMedia() {
            return media;
        }

        /**
         *
         * @param media
         * The media
         */
        public void setMedia(Media media) {
            this.media = media;
        }

        /**
         *
         * @return
         * The languages
         */
        public Languages getLanguages() {
            return languages;
        }

        /**
         *
         * @param languages
         * The languages
         */
        public void setLanguages(Languages languages) {
            this.languages = languages;
        }

        /**
         *
         * @return
         * The tags
         */
        public List<Tag> getTags() {
            return tags;
        }

        /**
         *
         * @param tags
         * The tags
         */
        public void setTags(List<Tag> tags) {
            this.tags = tags;
        }

        /**
         *
         * @return
         * The themes
         */
        public List<Theme> getThemes() {
            return themes;
        }

        /**
         *
         * @param themes
         * The themes
         */
        public void setThemes(List<Theme> themes) {
            this.themes = themes;
        }

        /**
         *
         * @return
         * The speakers
         */
        public List<Speaker> getSpeakers() {
            return speakers;
        }

        /**
         *
         * @param speakers
         * The speakers
         */
        public void setSpeakers(List<Speaker> speakers) {
            this.speakers = speakers;
        }

        /**
         *
         * @return
         * The ratings
         */
        public List<Rating> getRatings() {
            return ratings;
        }

        /**
         *
         * @param ratings
         * The ratings
         */
        public void setRatings(List<Rating> ratings) {
            this.ratings = ratings;
        }

    }
    public class Th {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Theme {

        @Expose
        private Theme_ theme;

        /**
         *
         * @return
         * The theme
         */
        public Theme_ getTheme() {
            return theme;
        }

        /**
         *
         * @param theme
         * The theme
         */
        public void setTheme(Theme_ theme) {
            this.theme = theme;
        }

    }
    public class Theme_ {

        @Expose
        private Integer id;
        @Expose
        private String name;

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class Tl {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Tr {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Uk {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Ur {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class ZhCn {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class ZhTw {

        @Expose
        private String name;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class _180k {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class _320k {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class _450k {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class _600k {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class _64k {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class _950k {

        @Expose
        private String uri;

        /**
         *
         * @return
         * The uri
         */
        public String getUri() {
            return uri;
        }

        /**
         *
         * @param uri
         * The uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }

    }
}


