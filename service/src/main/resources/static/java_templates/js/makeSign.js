
!
function(e) {
    function t(r) {
        try {
            if (n[r]) return n[r].exports;
            var i = n[r] = {
                i: r,
                l: !1,
                exports: {}
            };
            return e[r].call(i.exports, i, i.exports, t),
                i.l = !0,
                i.exports
        }catch (e){

        }
    }
    var n = {};
    t.m = e,
        t.c = n,
        t.d = function(e, n, r) {
            t.o(e, n) || Object.defineProperty(e, n, {
                configurable: !1,
                enumerable: !0,
                get: r
            })
        },
        t.n = function(e) {
            var n = e && e.__esModule ?
                function() {
                    return e.
                        default
                }:
                function() {
                    return e
                };
            return t.d(n, "a", n),
                n
        },
        t.o = function(e, t) {
            return Object.prototype.hasOwnProperty.call(e, t)
        },
        t.p = "/",
        t(t.s = 38)
} ([function(e, t) {
    var n = e.exports = "undefined" != typeof window && window.Math == Math ? window: "undefined" != typeof self && self.Math == Math ? self: Function("return this")();
    "number" == typeof __g && (__g = n)
},
    function(e, t) {
        var n = {}.hasOwnProperty;
        e.exports = function(e, t) {
            return n.call(e, t)
        }
    },
    function(e, t, n) {
        var r = n(3),
            i = n(10);
        e.exports = n(4) ?
            function(e, t, n) {
                return r.f(e, t, i(1, n))
            }: function(e, t, n) {
                return e[t] = n,
                    e
            }
    },
    function(e, t, n) {
        var r = n(8),
            i = n(29),
            o = n(16),
            a = Object.defineProperty;
        t.f = n(4) ? Object.defineProperty: function(e, t, n) {
            if (r(e), t = o(t, !0), r(n), i) try {
                return a(e, t, n)
            } catch(e) {}
            if ("get" in n || "set" in n) throw TypeError("Accessors not supported!");
            return "value" in n && (e[t] = n.value),
                e
        }
    },
    function(e, t, n) {
        e.exports = !n(9)(function() {
            return 7 != Object.defineProperty({},
                "a", {
                    get: function() {
                        return 7
                    }
                }).a
        })
    },
    function(e, t, n) {
        var r = n(49),
            i = n(13);
        e.exports = function(e) {
            return r(i(e))
        }
    },
    function(e, t, n) {
        var r = n(20)("wks"),
            i = n(11),
            o = n(0).Symbol,
            a = "function" == typeof o; (e.exports = function(e) {
            return r[e] || (r[e] = a && o[e] || (a ? o: i)("Symbol." + e))
        }).store = r
    },
    function(e, t) {
        e.exports = function(e) {
            return "object" == typeof e ? null !== e: "function" == typeof e
        }
    },
    function(e, t, n) {
        var r = n(7);
        e.exports = function(e) {
            if (!r(e)) throw TypeError(e + " is not an object!");
            return e
        }
    },
    function(e, t) {
        e.exports = function(e) {
            try {
                return !! e()
            } catch(e) {
                return ! 0
            }
        }
    },
    function(e, t) {
        e.exports = function(e, t) {
            return {
                enumerable: !(1 & e),
                configurable: !(2 & e),
                writable: !(4 & e),
                value: t
            }
        }
    },
    function(e, t) {
        var n = 0,
            r = Math.random();
        e.exports = function(e) {
            return "Symbol(".concat(void 0 === e ? "": e, ")_", (++n + r).toString(36))
        }
    },
    function(e, t) {
        var n = Math.ceil,
            r = Math.floor;
        e.exports = function(e) {
            return isNaN(e = +e) ? 0 : (e > 0 ? r: n)(e)
        }
    },
    function(e, t) {
        e.exports = function(e) {
            if (void 0 == e) throw TypeError("Can't call method on  " + e);
            return e
        }
    },
    function(e, t) {
        e.exports = !0
    },
    function(e, t) {
        var n = e.exports = {
            version: "2.5.3"
        };
        "number" == typeof __e && (__e = n)
    },
    function(e, t, n) {
        var r = n(7);
        e.exports = function(e, t) {
            if (!r(e)) return e;
            var n, i;
            if (t && "function" == typeof(n = e.toString) && !r(i = n.call(e))) return i;
            if ("function" == typeof(n = e.valueOf) && !r(i = n.call(e))) return i;
            if (!t && "function" == typeof(n = e.toString) && !r(i = n.call(e))) return i;
            throw TypeError("Can't convert object to primitive value")
        }
    },
    function(e, t) {
        e.exports = {}
    },
    function(e, t, n) {
        var r = n(33),
            i = n(21);
        e.exports = Object.keys ||
            function(e) {
                return r(e, i)
            }
    },
    function(e, t, n) {
        var r = n(20)("keys"),
            i = n(11);
        e.exports = function(e) {
            return r[e] || (r[e] = i(e))
        }
    },
    function(e, t, n) {
        var r = n(0),
            i = r["__core-js_shared__"] || (r["__core-js_shared__"] = {});
        e.exports = function(e) {
            return i[e] || (i[e] = {})
        }
    },
    function(e, t) {
        e.exports = "constructor,hasOwnProperty,isPrototypeOf,propertyIsEnumerable,toLocaleString,toString,valueOf".split(",")
    },
    function(e, t, n) {
        var r = n(3).f,
            i = n(1),
            o = n(6)("toStringTag");
        e.exports = function(e, t, n) {
            e && !i(e = n ? e: e.prototype, o) && r(e, o, {
                configurable: !0,
                value: t
            })
        }
    },
    function(e, t, n) {
        t.f = n(6)
    },
    function(e, t, n) {
        var r = n(0),
            i = n(15),
            o = n(14),
            a = n(23),
            s = n(3).f;
        e.exports = function(e) {
            var t = i.Symbol || (i.Symbol = o ? {}: r.Symbol || {});
            "_" == e.charAt(0) || e in t || s(t, e, {
                value: a.f(e)
            })
        }
    },
    function(e, t) {
        t.f = {}.propertyIsEnumerable
    },
    function(e, t, n) {
        "use strict"; (function(e) {
            var r, i, o = n(40),
                a = function(e) {
                    return e && e.__esModule ? e: {
                        default:
                        e
                    }
                } (o); !
                function(t, n) {
                    "object" == (0, a.
                        default)(e) && "object" == (0, a.
                        default)(e.exports) ? e.exports = t.document ? n(t, !0) : function(e) {
                        if (!e.document) throw new Error("jQuery requires a window with a document");
                        return n(e)
                    }: n(t)
                } ("undefined" != typeof window ? window: void 0,
                    function(o, s) {
                        function c(e, t) {
                            t = t || ce;
                            var n = t.createElement("script");
                            n.text = e,
                                t.head.appendChild(n).parentNode.removeChild(n)
                        }
                        function u(e) {
                            var t = !!e && "length" in e && e.length,
                                n = we.type(e);
                            return "function" !== n && !we.isWindow(e) && ("array" === n || 0 === t || "number" == typeof t && t > 0 && t - 1 in e)
                        }
                        function l(e, t) {
                            return e.nodeName && e.nodeName.toLowerCase() === t.toLowerCase()
                        }
                        function f(e, t, n) {
                            return we.isFunction(t) ? we.grep(e,
                                function(e, r) {
                                    return !! t.call(e, r, e) !== n
                                }) : t.nodeType ? we.grep(e,
                                function(e) {
                                    return e === t !== n
                                }) : "string" != typeof t ? we.grep(e,
                                function(e) {
                                    return de.call(t, e) > -1 !== n
                                }) : De.test(t) ? we.filter(t, e, n) : (t = we.filter(t, e), we.grep(e,
                                function(e) {
                                    return de.call(t, e) > -1 !== n && 1 === e.nodeType
                                }))
                        }
                        function p(e, t) {
                            for (; (e = e[t]) && 1 !== e.nodeType;);
                            return e
                        }
                        function d(e) {
                            var t = {};
                            return we.each(e.match(Me) || [],
                                function(e, n) {
                                    t[n] = !0
                                }),
                                t
                        }
                        function h(e) {
                            return e
                        }
                        function g(e) {
                            throw e
                        }
                        function v(e, t, n, r) {
                            var i;
                            try {
                                e && we.isFunction(i = e.promise) ? i.call(e).done(t).fail(n) : e && we.isFunction(i = e.then) ? i.call(e, t, n) : t.apply(void 0, [e].slice(r))
                            } catch(e) {
                                n.apply(void 0, [e])
                            }
                        }
                        function y() {
                            ce.removeEventListener("DOMContentLoaded", y),
                                o.removeEventListener("load", y),
                                we.ready()
                        }
                        function m() {
                            this.expando = we.expando + m.uid++
                        }
                        function x(e) {
                            return "true" === e || "false" !== e && ("null" === e ? null: e === +e + "" ? +e: Ue.test(e) ? JSON.parse(e) : e)
                        }
                        function b(e, t, n) {
                            var r;
                            if (void 0 === n && 1 === e.nodeType) if (r = "data-" + t.replace(ze, "-$&").toLowerCase(), "string" == typeof(n = e.getAttribute(r))) {
                                try {
                                    n = x(n)
                                } catch(e) {}
                                We.set(e, t, n)
                            } else n = void 0;
                            return n
                        }
                        function w(e, t, n, r) {
                            var i, o = 1,
                                a = 20,
                                s = r ?
                                    function() {
                                        return r.cur()
                                    }: function() {
                                        return we.css(e, t, "")
                                    },
                                c = s(),
                                u = n && n[3] || (we.cssNumber[t] ? "": "px"),
                                l = (we.cssNumber[t] || "px" !== u && +c) && $e.exec(we.css(e, t));
                            if (l && l[3] !== u) {
                                u = u || l[3],
                                    n = n || [],
                                    l = +c || 1;
                                do {
                                    o = o || ".5", l /= o, we.style(e, t, l + u)
                                } while ( o !== ( o = s () / c) && 1 !== o && --a)
                            }
                            return n && (l = +l || +c || 0, i = n[1] ? l + (n[1] + 1) * n[2] : +n[2], r && (r.unit = u, r.start = l, r.end = i)),
                                i
                        }
                        function _(e) {
                            var t, n = e.ownerDocument,
                                r = e.nodeName,
                                i = Xe[r];
                            return i || (t = n.body.appendChild(n.createElement(r)), i = we.css(t, "display"), t.parentNode.removeChild(t), "none" === i && (i = "block"), Xe[r] = i, i)
                        }
                        function k(e, t) {
                            for (var n, r, i = [], o = 0, a = e.length; o < a; o++) r = e[o],
                            r.style && (n = r.style.display, t ? ("none" === n && (i[o] = Be.get(r, "display") || null, i[o] || (r.style.display = "")), "" === r.style.display && Ge(r) && (i[o] = _(r))) : "none" !== n && (i[o] = "none", Be.set(r, "display", n)));
                            for (o = 0; o < a; o++) null != i[o] && (e[o].style.display = i[o]);
                            return e
                        }
                        function T(e, t) {
                            var n;
                            return n = void 0 !== e.getElementsByTagName ? e.getElementsByTagName(t || "*") : void 0 !== e.querySelectorAll ? e.querySelectorAll(t || "*") : [],
                                void 0 === t || t && l(e, t) ? we.merge([e], n) : n
                        }
                        function C(e, t) {
                            for (var n = 0,
                                     r = e.length; n < r; n++) Be.set(e[n], "globalEval", !t || Be.get(t[n], "globalEval"))
                        }
                        function S(e, t, n, r, i) {
                            for (var o, a, s, c, u, l, f = t.createDocumentFragment(), p = [], d = 0, h = e.length; d < h; d++) if ((o = e[d]) || 0 === o) if ("object" === we.type(o)) we.merge(p, o.nodeType ? [o] : o);
                            else if (tt.test(o)) {
                                for (a = a || f.appendChild(t.createElement("div")), s = (Je.exec(o) || ["", ""])[1].toLowerCase(), c = et[s] || et._default, a.innerHTML = c[1] + we.htmlPrefilter(o) + c[2], l = c[0]; l--;) a = a.lastChild;
                                we.merge(p, a.childNodes),
                                    a = f.firstChild,
                                    a.textContent = ""
                            } else p.push(t.createTextNode(o));
                            for (f.textContent = "", d = 0; o = p[d++];) if (r && we.inArray(o, r) > -1) i && i.push(o);
                            else if (u = we.contains(o.ownerDocument, o), a = T(f.appendChild(o), "script"), u && C(a), n) for (l = 0; o = a[l++];) Ze.test(o.type || "") && n.push(o);
                            return f
                        }
                        function A() {
                            return ! 0
                        }
                        function E() {
                            return ! 1
                        }
                        function j() {
                            try {
                                return ce.activeElement
                            } catch(e) {}
                        }
                        function N(e, t, n, r, i, o) {
                            var s, c;
                            if ("object" == (void 0 === t ? "undefined": (0, a.
                                    default)(t))) {
                                "string" != typeof n && (r = r || n, n = void 0);
                                for (c in t) N(e, c, n, r, t[c], o);
                                return e
                            }
                            if (null == r && null == i ? (i = n, r = n = void 0) : null == i && ("string" == typeof n ? (i = r, r = void 0) : (i = r, r = n, n = void 0)), !1 === i) i = E;
                            else if (!i) return e;
                            return 1 === o && (s = i, i = function(e) {
                                return we().off(e),
                                    s.apply(this, arguments)
                            },
                                i.guid = s.guid || (s.guid = we.guid++)),
                                e.each(function() {
                                    we.event.add(this, t, i, r, n)
                                })
                        }
                        function D(e, t) {
                            return l(e, "table") && l(11 !== t.nodeType ? t: t.firstChild, "tr") ? we(">tbody", e)[0] || e: e
                        }
                        function L(e) {
                            return e.type = (null !== e.getAttribute("type")) + "/" + e.type,
                                e
                        }
                        function O(e) {
                            var t = ut.exec(e.type);
                            return t ? e.type = t[1] : e.removeAttribute("type"),
                                e
                        }
                        function P(e, t) {
                            var n, r, i, o, a, s, c, u;
                            if (1 === t.nodeType) {
                                if (Be.hasData(e) && (o = Be.access(e), a = Be.set(t, o), u = o.events)) {
                                    delete a.handle,
                                        a.events = {};
                                    for (i in u) for (n = 0, r = u[i].length; n < r; n++) we.event.add(t, i, u[i][n])
                                }
                                We.hasData(e) && (s = We.access(e), c = we.extend({},
                                    s), We.set(t, c))
                            }
                        }
                        function F(e, t) {
                            var n = t.nodeName.toLowerCase();
                            "input" === n && Qe.test(e.type) ? t.checked = e.checked: "input" !== n && "textarea" !== n || (t.defaultValue = e.defaultValue)
                        }
                        function M(e, t, n, r) {
                            t = fe.apply([], t);
                            var i, o, a, s, u, l, f = 0,
                                p = e.length,
                                d = p - 1,
                                h = t[0],
                                g = we.isFunction(h);
                            if (g || p > 1 && "string" == typeof h && !xe.checkClone && ct.test(h)) return e.each(function(i) {
                                var o = e.eq(i);
                                g && (t[0] = h.call(this, i, o.html())),
                                    M(o, t, n, r)
                            });
                            if (p && (i = S(t, e[0].ownerDocument, !1, e, r), o = i.firstChild, 1 === i.childNodes.length && (i = o), o || r)) {
                                for (a = we.map(T(i, "script"), L), s = a.length; f < p; f++) u = i,
                                f !== d && (u = we.clone(u, !0, !0), s && we.merge(a, T(u, "script"))),
                                    n.call(e[f], u, f);
                                if (s) for (l = a[a.length - 1].ownerDocument, we.map(a, O), f = 0; f < s; f++) u = a[f],
                                Ze.test(u.type || "") && !Be.access(u, "globalEval") && we.contains(l, u) && (u.src ? we._evalUrl && we._evalUrl(u.src) : c(u.textContent.replace(lt, ""), l))
                            }
                            return e
                        }
                        function R(e, t, n) {
                            for (var r, i = t ? we.filter(t, e) : e, o = 0; null != (r = i[o]); o++) n || 1 !== r.nodeType || we.cleanData(T(r)),
                            r.parentNode && (n && we.contains(r.ownerDocument, r) && C(T(r, "script")), r.parentNode.removeChild(r));
                            return e
                        }
                        function q(e, t, n) {
                            var r, i, o, a, s = e.style;
                            return n = n || dt(e),
                            n && (a = n.getPropertyValue(t) || n[t], "" !== a || we.contains(e.ownerDocument, e) || (a = we.style(e, t)), !xe.pixelMarginRight() && pt.test(a) && ft.test(t) && (r = s.width, i = s.minWidth, o = s.maxWidth, s.minWidth = s.maxWidth = s.width = a, a = n.width, s.width = r, s.minWidth = i, s.maxWidth = o)),
                                void 0 !== a ? a + "": a
                        }
                        function H(e, t) {
                            return {
                                get: function() {
                                    return e() ? void delete this.get: (this.get = t).apply(this, arguments)
                                }
                            }
                        }
                        function I(e) {
                            if (e in xt) return e;
                            for (var t = e[0].toUpperCase() + e.slice(1), n = mt.length; n--;) if ((e = mt[n] + t) in xt) return e
                        }
                        function B(e) {
                            var t = we.cssProps[e];
                            return t || (t = we.cssProps[e] = I(e) || e),
                                t
                        }
                        function W(e, t, n) {
                            var r = $e.exec(t);
                            return r ? Math.max(0, r[2] - (n || 0)) + (r[3] || "px") : t
                        }
                        function U(e, t, n, r, i) {
                            var o, a = 0;
                            for (o = n === (r ? "border": "content") ? 4 : "width" === t ? 1 : 0; o < 4; o += 2)"margin" === n && (a += we.css(e, n + Ve[o], !0, i)),
                                r ? ("content" === n && (a -= we.css(e, "padding" + Ve[o], !0, i)), "margin" !== n && (a -= we.css(e, "border" + Ve[o] + "Width", !0, i))) : (a += we.css(e, "padding" + Ve[o], !0, i), "padding" !== n && (a += we.css(e, "border" + Ve[o] + "Width", !0, i)));
                            return a
                        }
                        function z(e, t, n) {
                            var r, i = dt(e),
                                o = q(e, t, i),
                                a = "border-box" === we.css(e, "boxSizing", !1, i);
                            return pt.test(o) ? o: (r = a && (xe.boxSizingReliable() || o === e.style[t]), "auto" === o && (o = e["offset" + t[0].toUpperCase() + t.slice(1)]), (o = parseFloat(o) || 0) + U(e, t, n || (a ? "border": "content"), r, i) + "px")
                        }
                        function K(e, t, n, r, i) {
                            return new K.prototype.init(e, t, n, r, i)
                        }
                        function $() {
                            wt && (!1 === ce.hidden && o.requestAnimationFrame ? o.requestAnimationFrame($) : o.setTimeout($, we.fx.interval), we.fx.tick())
                        }
                        function V() {
                            return o.setTimeout(function() {
                                bt = void 0
                            }),
                                bt = we.now()
                        }
                        function G(e, t) {
                            var n, r = 0,
                                i = {
                                    height: e
                                };
                            for (t = t ? 1 : 0; r < 4; r += 2 - t) n = Ve[r],
                                i["margin" + n] = i["padding" + n] = e;
                            return t && (i.opacity = i.width = e),
                                i
                        }
                        function Y(e, t, n) {
                            for (var r, i = (J.tweeners[t] || []).concat(J.tweeners["*"]), o = 0, a = i.length; o < a; o++) if (r = i[o].call(n, t, e)) return r
                        }
                        function X(e, t, n) {
                            var r, i, o, a, s, c, u, l, f = "width" in t || "height" in t,
                                p = this,
                                d = {},
                                h = e.style,
                                g = e.nodeType && Ge(e),
                                v = Be.get(e, "fxshow");
                            n.queue || (a = we._queueHooks(e, "fx"), null == a.unqueued && (a.unqueued = 0, s = a.empty.fire, a.empty.fire = function() {
                                a.unqueued || s()
                            }), a.unqueued++, p.always(function() {
                                p.always(function() {
                                    a.unqueued--,
                                    we.queue(e, "fx").length || a.empty.fire()
                                })
                            }));
                            for (r in t) if (i = t[r], _t.test(i)) {
                                if (delete t[r], o = o || "toggle" === i, i === (g ? "hide": "show")) {
                                    if ("show" !== i || !v || void 0 === v[r]) continue;
                                    g = !0
                                }
                                d[r] = v && v[r] || we.style(e, r)
                            }
                            if ((c = !we.isEmptyObject(t)) || !we.isEmptyObject(d)) {
                                f && 1 === e.nodeType && (n.overflow = [h.overflow, h.overflowX, h.overflowY], u = v && v.display, null == u && (u = Be.get(e, "display")), l = we.css(e, "display"), "none" === l && (u ? l = u: (k([e], !0), u = e.style.display || u, l = we.css(e, "display"), k([e]))), ("inline" === l || "inline-block" === l && null != u) && "none" === we.css(e, "float") && (c || (p.done(function() {
                                    h.display = u
                                }), null == u && (l = h.display, u = "none" === l ? "": l)), h.display = "inline-block")),
                                n.overflow && (h.overflow = "hidden", p.always(function() {
                                    h.overflow = n.overflow[0],
                                        h.overflowX = n.overflow[1],
                                        h.overflowY = n.overflow[2]
                                })),
                                    c = !1;
                                for (r in d) c || (v ? "hidden" in v && (g = v.hidden) : v = Be.access(e, "fxshow", {
                                    display: u
                                }), o && (v.hidden = !g), g && k([e], !0), p.done(function() {
                                    g || k([e]),
                                        Be.remove(e, "fxshow");
                                    for (r in d) we.style(e, r, d[r])
                                })),
                                    c = Y(g ? v[r] : 0, r, p),
                                r in v || (v[r] = c.start, g && (c.end = c.start, c.start = 0))
                            }
                        }
                        function Q(e, t) {
                            var n, r, i, o, a;
                            for (n in e) if (r = we.camelCase(n), i = t[r], o = e[n], Array.isArray(o) && (i = o[1], o = e[n] = o[0]), n !== r && (e[r] = o, delete e[n]), (a = we.cssHooks[r]) && "expand" in a) {
                                o = a.expand(o),
                                    delete e[r];
                                for (n in o) n in e || (e[n] = o[n], t[n] = i)
                            } else t[r] = i
                        }
                        function J(e, t, n) {
                            var r, i, o = 0,
                                a = J.prefilters.length,
                                s = we.Deferred().always(function() {
                                    delete c.elem
                                }),
                                c = function() {
                                    if (i) return ! 1;
                                    for (var t = bt || V(), n = Math.max(0, u.startTime + u.duration - t), r = n / u.duration || 0, o = 1 - r, a = 0, c = u.tweens.length; a < c; a++) u.tweens[a].run(o);
                                    return s.notifyWith(e, [u, o, n]),
                                        o < 1 && c ? n: (c || s.notifyWith(e, [u, 1, 0]), s.resolveWith(e, [u]), !1)
                                },
                                u = s.promise({
                                    elem: e,
                                    props: we.extend({},
                                        t),
                                    opts: we.extend(!0, {
                                            specialEasing: {},
                                            easing: we.easing._default
                                        },
                                        n),
                                    originalProperties: t,
                                    originalOptions: n,
                                    startTime: bt || V(),
                                    duration: n.duration,
                                    tweens: [],
                                    createTween: function(t, n) {
                                        var r = we.Tween(e, u.opts, t, n, u.opts.specialEasing[t] || u.opts.easing);
                                        return u.tweens.push(r),
                                            r
                                    },
                                    stop: function(t) {
                                        var n = 0,
                                            r = t ? u.tweens.length: 0;
                                        if (i) return this;
                                        for (i = !0; n < r; n++) u.tweens[n].run(1);
                                        return t ? (s.notifyWith(e, [u, 1, 0]), s.resolveWith(e, [u, t])) : s.rejectWith(e, [u, t]),
                                            this
                                    }
                                }),
                                l = u.props;
                            for (Q(l, u.opts.specialEasing); o < a; o++) if (r = J.prefilters[o].call(u, e, l, u.opts)) return we.isFunction(r.stop) && (we._queueHooks(u.elem, u.opts.queue).stop = we.proxy(r.stop, r)),
                                r;
                            return we.map(l, Y, u),
                            we.isFunction(u.opts.start) && u.opts.start.call(e, u),
                                u.progress(u.opts.progress).done(u.opts.done, u.opts.complete).fail(u.opts.fail).always(u.opts.always),
                                we.fx.timer(we.extend(c, {
                                    elem: e,
                                    anim: u,
                                    queue: u.opts.queue
                                })),
                                u
                        }
                        function Z(e) {
                            return (e.match(Me) || []).join(" ")
                        }
                        function ee(e) {
                            return e.getAttribute && e.getAttribute("class") || ""
                        }
                        function te(e, t, n, r) {
                            var i;
                            if (Array.isArray(t)) we.each(t,
                                function(t, i) {
                                    n || Ot.test(e) ? r(e, i) : te(e + "[" + ("object" == (void 0 === i ? "undefined": (0, a.
                                        default)(i)) && null != i ? t: "") + "]", i, n, r)
                                });
                            else if (n || "object" !== we.type(t)) r(e, t);
                            else for (i in t) te(e + "[" + i + "]", t[i], n, r)
                        }
                        function ne(e) {
                            return function(t, n) {
                                "string" != typeof t && (n = t, t = "*");
                                var r, i = 0,
                                    o = t.toLowerCase().match(Me) || [];
                                if (we.isFunction(n)) for (; r = o[i++];)"+" === r[0] ? (r = r.slice(1) || "*", (e[r] = e[r] || []).unshift(n)) : (e[r] = e[r] || []).push(n)
                            }
                        }
                        function re(e, t, n, r) {
                            function i(s) {
                                var c;
                                return o[s] = !0,
                                    we.each(e[s] || [],
                                        function(e, s) {
                                            var u = s(t, n, r);
                                            return "string" != typeof u || a || o[u] ? a ? !(c = u) : void 0 : (t.dataTypes.unshift(u), i(u), !1)
                                        }),
                                    c
                            }
                            var o = {},
                                a = e === Kt;
                            return i(t.dataTypes[0]) || !o["*"] && i("*")
                        }
                        function ie(e, t) {
                            var n, r, i = we.ajaxSettings.flatOptions || {};
                            for (n in t) void 0 !== t[n] && ((i[n] ? e: r || (r = {}))[n] = t[n]);
                            return r && we.extend(!0, e, r),
                                e
                        }
                        function oe(e, t, n) {
                            for (var r, i, o, a, s = e.contents,
                                     c = e.dataTypes;
                                 "*" === c[0];) c.shift(),
                            void 0 === r && (r = e.mimeType || t.getResponseHeader("Content-Type"));
                            if (r) for (i in s) if (s[i] && s[i].test(r)) {
                                c.unshift(i);
                                break
                            }
                            if (c[0] in n) o = c[0];
                            else {
                                for (i in n) {
                                    if (!c[0] || e.converters[i + " " + c[0]]) {
                                        o = i;
                                        break
                                    }
                                    a || (a = i)
                                }
                                o = o || a
                            }
                            if (o) return o !== c[0] && c.unshift(o),
                                n[o]
                        }
                        function ae(e, t, n, r) {
                            var i, o, a, s, c, u = {},
                                l = e.dataTypes.slice();
                            if (l[1]) for (a in e.converters) u[a.toLowerCase()] = e.converters[a];
                            for (o = l.shift(); o;) if (e.responseFields[o] && (n[e.responseFields[o]] = t), !c && r && e.dataFilter && (t = e.dataFilter(t, e.dataType)), c = o, o = l.shift()) if ("*" === o) o = c;
                            else if ("*" !== c && c !== o) {
                                if (! (a = u[c + " " + o] || u["* " + o])) for (i in u) if (s = i.split(" "), s[1] === o && (a = u[c + " " + s[0]] || u["* " + s[0]])) { ! 0 === a ? a = u[i] : !0 !== u[i] && (o = s[0], l.unshift(s[1]));
                                    break
                                }
                                if (!0 !== a) if (a && e.throws) t = a(t);
                                else try {
                                        t = a(t)
                                    } catch(e) {
                                        return {
                                            state: "parsererror",
                                            error: a ? e: "No conversion from " + c + " to " + o
                                        }
                                    }
                            }
                            return {
                                state: "success",
                                data: t
                            }
                        }
                        var se = [],
                            ce = o.document,
                            ue = Object.getPrototypeOf,
                            le = se.slice,
                            fe = se.concat,
                            pe = se.push,
                            de = se.indexOf,
                            he = {},
                            ge = he.toString,
                            ve = he.hasOwnProperty,
                            ye = ve.toString,
                            me = ye.call(Object),
                            xe = {},
                            be = "3.2.1",
                            we = function e(t, n) {
                                return new e.fn.init(t, n)
                            },
                            _e = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g,
                            ke = /^-ms-/,
                            Te = /-([a-z])/g,
                            Ce = function(e, t) {
                                return t.toUpperCase()
                            };
                        we.fn = we.prototype = {
                            jquery: be,
                            constructor: we,
                            length: 0,
                            toArray: function() {
                                return le.call(this)
                            },
                            get: function(e) {
                                return null == e ? le.call(this) : e < 0 ? this[e + this.length] : this[e]
                            },
                            pushStack: function(e) {
                                var t = we.merge(this.constructor(), e);
                                return t.prevObject = this,
                                    t
                            },
                            each: function(e) {
                                return we.each(this, e)
                            },
                            map: function(e) {
                                return this.pushStack(we.map(this,
                                    function(t, n) {
                                        return e.call(t, n, t)
                                    }))
                            },
                            slice: function() {
                                return this.pushStack(le.apply(this, arguments))
                            },
                            first: function() {
                                return this.eq(0)
                            },
                            last: function() {
                                return this.eq( - 1)
                            },
                            eq: function(e) {
                                var t = this.length,
                                    n = +e + (e < 0 ? t: 0);
                                return this.pushStack(n >= 0 && n < t ? [this[n]] : [])
                            },
                            end: function() {
                                return this.prevObject || this.constructor()
                            },
                            push: pe,
                            sort: se.sort,
                            splice: se.splice
                        },
                            we.extend = we.fn.extend = function() {
                                var e, t, n, r, i, o, s = arguments[0] || {},
                                    c = 1,
                                    u = arguments.length,
                                    l = !1;
                                for ("boolean" == typeof s && (l = s, s = arguments[c] || {},
                                    c++), "object" == (void 0 === s ? "undefined": (0, a.
                                    default)(s)) || we.isFunction(s) || (s = {}), c === u && (s = this, c--); c < u; c++) if (null != (e = arguments[c])) for (t in e) n = s[t],
                                    r = e[t],
                                s !== r && (l && r && (we.isPlainObject(r) || (i = Array.isArray(r))) ? (i ? (i = !1, o = n && Array.isArray(n) ? n: []) : o = n && we.isPlainObject(n) ? n: {},
                                    s[t] = we.extend(l, o, r)) : void 0 !== r && (s[t] = r));
                                return s
                            },
                            we.extend({
                                expando: "jQuery" + (be + Math.random()).replace(/\D/g, ""),
                                isReady: !0,
                                error: function(e) {
                                    throw new Error(e)
                                },
                                noop: function() {},
                                isFunction: function(e) {
                                    return "function" === we.type(e)
                                },
                                isWindow: function(e) {
                                    return null != e && e === e.window
                                },
                                isNumeric: function(e) {
                                    var t = we.type(e);
                                    return ("number" === t || "string" === t) && !isNaN(e - parseFloat(e))
                                },
                                isPlainObject: function(e) {
                                    var t, n;
                                    return ! (!e || "[object Object]" !== ge.call(e) || (t = ue(e)) && ("function" != typeof(n = ve.call(t, "constructor") && t.constructor) || ye.call(n) !== me))
                                },
                                isEmptyObject: function(e) {
                                    var t;
                                    for (t in e) return ! 1;
                                    return ! 0
                                },
                                type: function(e) {
                                    return null == e ? e + "": "object" == (void 0 === e ? "undefined": (0, a.
                                        default)(e)) || "function" == typeof e ? he[ge.call(e)] || "object": void 0 === e ? "undefined": (0, a.
                                        default)(e)
                                },
                                globalEval: function(e) {
                                    c(e)
                                },
                                camelCase: function(e) {
                                    return e.replace(ke, "ms-").replace(Te, Ce)
                                },
                                each: function(e, t) {
                                    var n, r = 0;
                                    if (u(e)) for (n = e.length; r < n && !1 !== t.call(e[r], r, e[r]); r++);
                                    else for (r in e) if (!1 === t.call(e[r], r, e[r])) break;
                                    return e
                                },
                                trim: function(e) {
                                    return null == e ? "": (e + "").replace(_e, "")
                                },
                                makeArray: function(e, t) {
                                    var n = t || [];
                                    return null != e && (u(Object(e)) ? we.merge(n, "string" == typeof e ? [e] : e) : pe.call(n, e)),
                                        n
                                },
                                inArray: function(e, t, n) {
                                    return null == t ? -1 : de.call(t, e, n)
                                },
                                merge: function(e, t) {
                                    for (var n = +t.length,
                                             r = 0,
                                             i = e.length; r < n; r++) e[i++] = t[r];
                                    return e.length = i,
                                        e
                                },
                                grep: function(e, t, n) {
                                    for (var r = [], i = 0, o = e.length, a = !n; i < o; i++) ! t(e[i], i) !== a && r.push(e[i]);
                                    return r
                                },
                                map: function(e, t, n) {
                                    var r, i, o = 0,
                                        a = [];
                                    if (u(e)) for (r = e.length; o < r; o++) null != (i = t(e[o], o, n)) && a.push(i);
                                    else for (o in e) null != (i = t(e[o], o, n)) && a.push(i);
                                    return fe.apply([], a)
                                },
                                guid: 1,
                                proxy: function(e, t) {
                                    var n, r, i;
                                    if ("string" == typeof t && (n = e[t], t = e, e = n), we.isFunction(e)) return r = le.call(arguments, 2),
                                        i = function() {
                                            return e.apply(t || this, r.concat(le.call(arguments)))
                                        },
                                        i.guid = e.guid = e.guid || we.guid++,
                                        i
                                },
                                now: Date.now,
                                support: xe
                            }),
                        "function" == typeof Symbol && (we.fn[Symbol.iterator] = se[Symbol.iterator]),
                            we.each("Boolean Number String Function Array Date RegExp Object Error Symbol".split(" "),
                                function(e, t) {
                                    he["[object " + t + "]"] = t.toLowerCase()
                                });
                        var Se = function(e) {
                            function t(e, t, n, r) {
                                var i, o, a, s, c, l, p, d = t && t.ownerDocument,
                                    h = t ? t.nodeType: 9;
                                if (n = n || [], "string" != typeof e || !e || 1 !== h && 9 !== h && 11 !== h) return n;
                                if (!r && ((t ? t.ownerDocument || t: H) !== D && N(t), t = t || D, O)) {
                                    if (11 !== h && (c = ge.exec(e))) if (i = c[1]) {
                                        if (9 === h) {
                                            if (! (a = t.getElementById(i))) return n;
                                            if (a.id === i) return n.push(a),
                                                n
                                        } else if (d && (a = d.getElementById(i)) && R(t, a) && a.id === i) return n.push(a),
                                            n
                                    } else {
                                        if (c[2]) return X.apply(n, t.getElementsByTagName(e)),
                                            n;
                                        if ((i = c[3]) && b.getElementsByClassName && t.getElementsByClassName) return X.apply(n, t.getElementsByClassName(i)),
                                            n
                                    }
                                    if (b.qsa && !z[e + " "] && (!P || !P.test(e))) {
                                        if (1 !== h) d = t,
                                            p = e;
                                        else if ("object" !== t.nodeName.toLowerCase()) {
                                            for ((s = t.getAttribute("id")) ? s = s.replace(xe, be) : t.setAttribute("id", s = q), l = T(e), o = l.length; o--;) l[o] = "#" + s + " " + f(l[o]);
                                            p = l.join(","),
                                                d = ve.test(e) && u(t.parentNode) || t
                                        }
                                        if (p) try {
                                            return X.apply(n, d.querySelectorAll(p)),
                                                n
                                        } catch(e) {} finally {
                                            s === q && t.removeAttribute("id")
                                        }
                                    }
                                }
                                return S(e.replace(oe, "$1"), t, n, r)
                            }
                            function n() {
                                function e(n, r) {
                                    return t.push(n + " ") > w.cacheLength && delete e[t.shift()],
                                        e[n + " "] = r
                                }
                                var t = [];
                                return e
                            }
                            function r(e) {
                                return e[q] = !0,
                                    e
                            }
                            function i(e) {
                                var t = D.createElement("fieldset");
                                try {
                                    return !! e(t)
                                } catch(e) {
                                    return ! 1
                                } finally {
                                    t.parentNode && t.parentNode.removeChild(t),
                                        t = null
                                }
                            }
                            function o(e, t) {
                                for (var n = e.split("|"), r = n.length; r--;) w.attrHandle[n[r]] = t
                            }
                            function a(e, t) {
                                var n = t && e,
                                    r = n && 1 === e.nodeType && 1 === t.nodeType && e.sourceIndex - t.sourceIndex;
                                if (r) return r;
                                if (n) for (; n = n.nextSibling;) if (n === t) return - 1;
                                return e ? 1 : -1
                            }
                            function s(e) {
                                return function(t) {
                                    return "form" in t ? t.parentNode && !1 === t.disabled ? "label" in t ? "label" in t.parentNode ? t.parentNode.disabled === e: t.disabled === e: t.isDisabled === e || t.isDisabled !== !e && _e(t) === e: t.disabled === e: "label" in t && t.disabled === e
                                }
                            }
                            function c(e) {
                                return r(function(t) {
                                    return t = +t,
                                        r(function(n, r) {
                                            for (var i, o = e([], n.length, t), a = o.length; a--;) n[i = o[a]] && (n[i] = !(r[i] = n[i]))
                                        })
                                })
                            }
                            function u(e) {
                                return e && void 0 !== e.getElementsByTagName && e
                            }
                            function l() {}
                            function f(e) {
                                for (var t = 0,
                                         n = e.length,
                                         r = ""; t < n; t++) r += e[t].value;
                                return r
                            }
                            function p(e, t, n) {
                                var r = t.dir,
                                    i = t.next,
                                    o = i || r,
                                    a = n && "parentNode" === o,
                                    s = B++;
                                return t.first ?
                                    function(t, n, i) {
                                        for (; t = t[r];) if (1 === t.nodeType || a) return e(t, n, i);
                                        return ! 1
                                    }: function(t, n, c) {
                                        var u, l, f, p = [I, s];
                                        if (c) {
                                            for (; t = t[r];) if ((1 === t.nodeType || a) && e(t, n, c)) return ! 0
                                        } else for (; t = t[r];) if (1 === t.nodeType || a) if (f = t[q] || (t[q] = {}), l = f[t.uniqueID] || (f[t.uniqueID] = {}), i && i === t.nodeName.toLowerCase()) t = t[r] || t;
                                        else {
                                            if ((u = l[o]) && u[0] === I && u[1] === s) return p[2] = u[2];
                                            if (l[o] = p, p[2] = e(t, n, c)) return ! 0
                                        }
                                        return ! 1
                                    }
                            }
                            function d(e) {
                                return e.length > 1 ?
                                    function(t, n, r) {
                                        for (var i = e.length; i--;) if (!e[i](t, n, r)) return ! 1;
                                        return ! 0
                                    }: e[0]
                            }
                            function h(e, n, r) {
                                for (var i = 0,
                                         o = n.length; i < o; i++) t(e, n[i], r);
                                return r
                            }
                            function g(e, t, n, r, i) {
                                for (var o, a = [], s = 0, c = e.length, u = null != t; s < c; s++)(o = e[s]) && (n && !n(o, r, i) || (a.push(o), u && t.push(s)));
                                return a
                            }
                            function v(e, t, n, i, o, a) {
                                return i && !i[q] && (i = v(i)),
                                o && !o[q] && (o = v(o, a)),
                                    r(function(r, a, s, c) {
                                        var u, l, f, p = [],
                                            d = [],
                                            v = a.length,
                                            y = r || h(t || "*", s.nodeType ? [s] : s, []),
                                            m = !e || !r && t ? y: g(y, p, e, s, c),
                                            x = n ? o || (r ? e: v || i) ? [] : a: m;
                                        if (n && n(m, x, s, c), i) for (u = g(x, d), i(u, [], s, c), l = u.length; l--;)(f = u[l]) && (x[d[l]] = !(m[d[l]] = f));
                                        if (r) {
                                            if (o || e) {
                                                if (o) {
                                                    for (u = [], l = x.length; l--;)(f = x[l]) && u.push(m[l] = f);
                                                    o(null, x = [], u, c)
                                                }
                                                for (l = x.length; l--;)(f = x[l]) && (u = o ? J(r, f) : p[l]) > -1 && (r[u] = !(a[u] = f))
                                            }
                                        } else x = g(x === a ? x.splice(v, x.length) : x),
                                            o ? o(null, a, x, c) : X.apply(a, x)
                                    })
                            }
                            function y(e) {
                                for (var t, n, r, i = e.length,
                                         o = w.relative[e[0].type], a = o || w.relative[" "], s = o ? 1 : 0, c = p(function(e) {
                                            return e === t
                                        },
                                        a, !0), u = p(function(e) {
                                            return J(t, e) > -1
                                        },
                                        a, !0), l = [function(e, n, r) {
                                        var i = !o && (r || n !== A) || ((t = n).nodeType ? c(e, n, r) : u(e, n, r));
                                        return t = null,
                                            i
                                    }]; s < i; s++) if (n = w.relative[e[s].type]) l = [p(d(l), n)];
                                else {
                                    if (n = w.filter[e[s].type].apply(null, e[s].matches), n[q]) {
                                        for (r = ++s; r < i && !w.relative[e[r].type]; r++);
                                        return v(s > 1 && d(l), s > 1 && f(e.slice(0, s - 1).concat({
                                            value: " " === e[s - 2].type ? "*": ""
                                        })).replace(oe, "$1"), n, s < r && y(e.slice(s, r)), r < i && y(e = e.slice(r)), r < i && f(e))
                                    }
                                    l.push(n)
                                }
                                return d(l)
                            }
                            function m(e, n) {
                                var i = n.length > 0,
                                    o = e.length > 0,
                                    a = function(r, a, s, c, u) {
                                        var l, f, p, d = 0,
                                            h = "0",
                                            v = r && [],
                                            y = [],
                                            m = A,
                                            x = r || o && w.find.TAG("*", u),
                                            b = I += null == m ? 1 : Math.random() || .1,
                                            _ = x.length;
                                        for (u && (A = a === D || a || u); h !== _ && null != (l = x[h]); h++) {
                                            if (o && l) {
                                                for (f = 0, a || l.ownerDocument === D || (N(l), s = !O); p = e[f++];) if (p(l, a || D, s)) {
                                                    c.push(l);
                                                    break
                                                }
                                                u && (I = b)
                                            }
                                            i && ((l = !p && l) && d--, r && v.push(l))
                                        }
                                        if (d += h, i && h !== d) {
                                            for (f = 0; p = n[f++];) p(v, y, a, s);
                                            if (r) {
                                                if (d > 0) for (; h--;) v[h] || y[h] || (y[h] = G.call(c));
                                                y = g(y)
                                            }
                                            X.apply(c, y),
                                            u && !r && y.length > 0 && d + n.length > 1 && t.uniqueSort(c)
                                        }
                                        return u && (I = b, A = m),
                                            v
                                    };
                                return i ? r(a) : a
                            }
                            var x, b, w, _, k, T, C, S, A, E, j, N, D, L, O, P, F, M, R, q = "sizzle" + 1 * new Date,
                                H = e.document,
                                I = 0,
                                B = 0,
                                W = n(),
                                U = n(),
                                z = n(),
                                K = function(e, t) {
                                    return e === t && (j = !0),
                                        0
                                },
                                $ = {}.hasOwnProperty,
                                V = [],
                                G = V.pop,
                                Y = V.push,
                                X = V.push,
                                Q = V.slice,
                                J = function(e, t) {
                                    for (var n = 0,
                                             r = e.length; n < r; n++) if (e[n] === t) return n;
                                    return - 1
                                },
                                Z = "checked|selected|async|autofocus|autoplay|controls|defer|disabled|hidden|ismap|loop|multiple|open|readonly|required|scoped",
                                ee = "[\\x20\\t\\r\\n\\f]",
                                te = "(?:\\\\.|[\\w-]|[^\0-\\xa0])+",
                                ne = "\\[" + ee + "*(" + te + ")(?:" + ee + "*([*^$|!~]?=)" + ee + "*(?:'((?:\\\\.|[^\\\\'])*)'|\"((?:\\\\.|[^\\\\\"])*)\"|(" + te + "))|)" + ee + "*\\]",
                                re = ":(" + te + ")(?:\\((('((?:\\\\.|[^\\\\'])*)'|\"((?:\\\\.|[^\\\\\"])*)\")|((?:\\\\.|[^\\\\()[\\]]|" + ne + ")*)|.*)\\)|)",
                                ie = new RegExp(ee + "+", "g"),
                                oe = new RegExp("^" + ee + "+|((?:^|[^\\\\])(?:\\\\.)*)" + ee + "+$", "g"),
                                ae = new RegExp("^" + ee + "*," + ee + "*"),
                                se = new RegExp("^" + ee + "*([>+~]|" + ee + ")" + ee + "*"),
                                ce = new RegExp("=" + ee + "*([^\\]'\"]*?)" + ee + "*\\]", "g"),
                                ue = new RegExp(re),
                                le = new RegExp("^" + te + "$"),
                                fe = {
                                    ID: new RegExp("^#(" + te + ")"),
                                    CLASS: new RegExp("^\\.(" + te + ")"),
                                    TAG: new RegExp("^(" + te + "|[*])"),
                                    ATTR: new RegExp("^" + ne),
                                    PSEUDO: new RegExp("^" + re),
                                    CHILD: new RegExp("^:(only|first|last|nth|nth-last)-(child|of-type)(?:\\(" + ee + "*(even|odd|(([+-]|)(\\d*)n|)" + ee + "*(?:([+-]|)" + ee + "*(\\d+)|))" + ee + "*\\)|)", "i"),
                                    bool: new RegExp("^(?:" + Z + ")$", "i"),
                                    needsContext: new RegExp("^" + ee + "*[>+~]|:(even|odd|eq|gt|lt|nth|first|last)(?:\\(" + ee + "*((?:-\\d)?\\d*)" + ee + "*\\)|)(?=[^-]|$)", "i")
                                },
                                pe = /^(?:input|select|textarea|button)$/i,
                                de = /^h\d$/i,
                                he = /^[^{]+\{\s*\[native \w/,
                                ge = /^(?:#([\w-]+)|(\w+)|\.([\w-]+))$/,
                                ve = /[+~]/,
                                ye = new RegExp("\\\\([\\da-f]{1,6}" + ee + "?|(" + ee + ")|.)", "ig"),
                                me = function(e, t, n) {
                                    var r = "0x" + t - 65536;
                                    return r !== r || n ? t: r < 0 ? String.fromCharCode(r + 65536) : String.fromCharCode(r >> 10 | 55296, 1023 & r | 56320)
                                },
                                xe = /([\0-\x1f\x7f]|^-?\d)|^-$|[^\0-\x1f\x7f-\uFFFF\w-]/g,
                                be = function(e, t) {
                                    return t ? "\0" === e ? "�": e.slice(0, -1) + "\\" + e.charCodeAt(e.length - 1).toString(16) + " ": "\\" + e
                                },
                                we = function() {
                                    N()
                                },
                                _e = p(function(e) {
                                        return ! 0 === e.disabled && ("form" in e || "label" in e)
                                    },
                                    {
                                        dir: "parentNode",
                                        next: "legend"
                                    });
                            try {
                                X.apply(V = Q.call(H.childNodes), H.childNodes),
                                    V[H.childNodes.length].nodeType
                            } catch(e) {
                                X = {
                                    apply: V.length ?
                                        function(e, t) {
                                            Y.apply(e, Q.call(t))
                                        }: function(e, t) {
                                            for (var n = e.length,
                                                     r = 0; e[n++] = t[r++];);
                                            e.length = n - 1
                                        }
                                }
                            }
                            b = t.support = {},
                                k = t.isXML = function(e) {
                                    var t = e && (e.ownerDocument || e).documentElement;
                                    return !! t && "HTML" !== t.nodeName
                                },
                                N = t.setDocument = function(e) {
                                    var t, n, r = e ? e.ownerDocument || e: H;
                                    return r !== D && 9 === r.nodeType && r.documentElement ? (D = r, L = D.documentElement, O = !k(D), H !== D && (n = D.defaultView) && n.top !== n && (n.addEventListener ? n.addEventListener("unload", we, !1) : n.attachEvent && n.attachEvent("onunload", we)), b.attributes = i(function(e) {
                                        return e.className = "i",
                                            !e.getAttribute("className")
                                    }), b.getElementsByTagName = i(function(e) {
                                        return e.appendChild(D.createComment("")),
                                            !e.getElementsByTagName("*").length
                                    }), b.getElementsByClassName = he.test(D.getElementsByClassName), b.getById = i(function(e) {
                                        return L.appendChild(e).id = q,
                                        !D.getElementsByName || !D.getElementsByName(q).length
                                    }), b.getById ? (w.filter.ID = function(e) {
                                        var t = e.replace(ye, me);
                                        return function(e) {
                                            return e.getAttribute("id") === t
                                        }
                                    },
                                        w.find.ID = function(e, t) {
                                            if (void 0 !== t.getElementById && O) {
                                                var n = t.getElementById(e);
                                                return n ? [n] : []
                                            }
                                        }) : (w.filter.ID = function(e) {
                                        var t = e.replace(ye, me);
                                        return function(e) {
                                            var n = void 0 !== e.getAttributeNode && e.getAttributeNode("id");
                                            return n && n.value === t
                                        }
                                    },
                                        w.find.ID = function(e, t) {
                                            if (void 0 !== t.getElementById && O) {
                                                var n, r, i, o = t.getElementById(e);
                                                if (o) {
                                                    if ((n = o.getAttributeNode("id")) && n.value === e) return [o];
                                                    for (i = t.getElementsByName(e), r = 0; o = i[r++];) if ((n = o.getAttributeNode("id")) && n.value === e) return [o]
                                                }
                                                return []
                                            }
                                        }), w.find.TAG = b.getElementsByTagName ?
                                        function(e, t) {
                                            return void 0 !== t.getElementsByTagName ? t.getElementsByTagName(e) : b.qsa ? t.querySelectorAll(e) : void 0
                                        }: function(e, t) {
                                            var n, r = [],
                                                i = 0,
                                                o = t.getElementsByTagName(e);
                                            if ("*" === e) {
                                                for (; n = o[i++];) 1 === n.nodeType && r.push(n);
                                                return r
                                            }
                                            return o
                                        },
                                        w.find.CLASS = b.getElementsByClassName &&
                                            function(e, t) {
                                                if (void 0 !== t.getElementsByClassName && O) return t.getElementsByClassName(e)
                                            },
                                        F = [], P = [], (b.qsa = he.test(D.querySelectorAll)) && (i(function(e) {
                                        L.appendChild(e).innerHTML = "<a id='" + q + "'></a><select id='" + q + "-\r\\' msallowcapture=''><option selected=''></option></select>",
                                        e.querySelectorAll("[msallowcapture^='']").length && P.push("[*^$]=" + ee + "*(?:''|\"\")"),
                                        e.querySelectorAll("[selected]").length || P.push("\\[" + ee + "*(?:value|" + Z + ")"),
                                        e.querySelectorAll("[id~=" + q + "-]").length || P.push("~="),
                                        e.querySelectorAll(":checked").length || P.push(":checked"),
                                        e.querySelectorAll("a#" + q + "+*").length || P.push(".#.+[+~]")
                                    }), i(function(e) {
                                        e.innerHTML = "<a href='' disabled='disabled'></a><select disabled='disabled'><option/></select>";
                                        var t = D.createElement("input");
                                        t.setAttribute("type", "hidden"),
                                            e.appendChild(t).setAttribute("name", "D"),
                                        e.querySelectorAll("[name=d]").length && P.push("name" + ee + "*[*^$|!~]?="),
                                        2 !== e.querySelectorAll(":enabled").length && P.push(":enabled", ":disabled"),
                                            L.appendChild(e).disabled = !0,
                                        2 !== e.querySelectorAll(":disabled").length && P.push(":enabled", ":disabled"),
                                            e.querySelectorAll("*,:x"),
                                            P.push(",.*:")
                                    })), (b.matchesSelector = he.test(M = L.matches || L.webkitMatchesSelector || L.mozMatchesSelector || L.oMatchesSelector || L.msMatchesSelector)) && i(function(e) {
                                        b.disconnectedMatch = M.call(e, "*"),
                                            M.call(e, "[s!='']:x"),
                                            F.push("!=", re)
                                    }), P = P.length && new RegExp(P.join("|")), F = F.length && new RegExp(F.join("|")), t = he.test(L.compareDocumentPosition), R = t || he.test(L.contains) ?
                                        function(e, t) {
                                            var n = 9 === e.nodeType ? e.documentElement: e,
                                                r = t && t.parentNode;
                                            return e === r || !(!r || 1 !== r.nodeType || !(n.contains ? n.contains(r) : e.compareDocumentPosition && 16 & e.compareDocumentPosition(r)))
                                        }: function(e, t) {
                                            if (t) for (; t = t.parentNode;) if (t === e) return ! 0;
                                            return ! 1
                                        },
                                        K = t ?
                                            function(e, t) {
                                                if (e === t) return j = !0,
                                                    0;
                                                var n = !e.compareDocumentPosition - !t.compareDocumentPosition;
                                                return n || (n = (e.ownerDocument || e) === (t.ownerDocument || t) ? e.compareDocumentPosition(t) : 1, 1 & n || !b.sortDetached && t.compareDocumentPosition(e) === n ? e === D || e.ownerDocument === H && R(H, e) ? -1 : t === D || t.ownerDocument === H && R(H, t) ? 1 : E ? J(E, e) - J(E, t) : 0 : 4 & n ? -1 : 1)
                                            }: function(e, t) {
                                                if (e === t) return j = !0,
                                                    0;
                                                var n, r = 0,
                                                    i = e.parentNode,
                                                    o = t.parentNode,
                                                    s = [e],
                                                    c = [t];
                                                if (!i || !o) return e === D ? -1 : t === D ? 1 : i ? -1 : o ? 1 : E ? J(E, e) - J(E, t) : 0;
                                                if (i === o) return a(e, t);
                                                for (n = e; n = n.parentNode;) s.unshift(n);
                                                for (n = t; n = n.parentNode;) c.unshift(n);
                                                for (; s[r] === c[r];) r++;
                                                return r ? a(s[r], c[r]) : s[r] === H ? -1 : c[r] === H ? 1 : 0
                                            },
                                        D) : D
                                },
                                t.matches = function(e, n) {
                                    return t(e, null, null, n)
                                },
                                t.matchesSelector = function(e, n) {
                                    if ((e.ownerDocument || e) !== D && N(e), n = n.replace(ce, "='$1']"), b.matchesSelector && O && !z[n + " "] && (!F || !F.test(n)) && (!P || !P.test(n))) try {
                                        var r = M.call(e, n);
                                        if (r || b.disconnectedMatch || e.document && 11 !== e.document.nodeType) return r
                                    } catch(e) {}
                                    return t(n, D, null, [e]).length > 0
                                },
                                t.contains = function(e, t) {
                                    return (e.ownerDocument || e) !== D && N(e),
                                        R(e, t)
                                },
                                t.attr = function(e, t) { (e.ownerDocument || e) !== D && N(e);
                                    var n = w.attrHandle[t.toLowerCase()],
                                        r = n && $.call(w.attrHandle, t.toLowerCase()) ? n(e, t, !O) : void 0;
                                    return void 0 !== r ? r: b.attributes || !O ? e.getAttribute(t) : (r = e.getAttributeNode(t)) && r.specified ? r.value: null
                                },
                                t.escape = function(e) {
                                    return (e + "").replace(xe, be)
                                },
                                t.error = function(e) {
                                    throw new Error("Syntax error, unrecognized expression: " + e)
                                },
                                t.uniqueSort = function(e) {
                                    var t, n = [],
                                        r = 0,
                                        i = 0;
                                    if (j = !b.detectDuplicates, E = !b.sortStable && e.slice(0), e.sort(K), j) {
                                        for (; t = e[i++];) t === e[i] && (r = n.push(i));
                                        for (; r--;) e.splice(n[r], 1)
                                    }
                                    return E = null,
                                        e
                                },
                                _ = t.getText = function(e) {
                                    var t, n = "",
                                        r = 0,
                                        i = e.nodeType;
                                    if (i) {
                                        if (1 === i || 9 === i || 11 === i) {
                                            if ("string" == typeof e.textContent) return e.textContent;
                                            for (e = e.firstChild; e; e = e.nextSibling) n += _(e)
                                        } else if (3 === i || 4 === i) return e.nodeValue
                                    } else for (; t = e[r++];) n += _(t);
                                    return n
                                },
                                w = t.selectors = {
                                    cacheLength: 50,
                                    createPseudo: r,
                                    match: fe,
                                    attrHandle: {},
                                    find: {},
                                    relative: {
                                        ">": {
                                            dir: "parentNode",
                                            first: !0
                                        },
                                        " ": {
                                            dir: "parentNode"
                                        },
                                        "+": {
                                            dir: "previousSibling",
                                            first: !0
                                        },
                                        "~": {
                                            dir: "previousSibling"
                                        }
                                    },
                                    preFilter: {
                                        ATTR: function(e) {
                                            return e[1] = e[1].replace(ye, me),
                                                e[3] = (e[3] || e[4] || e[5] || "").replace(ye, me),
                                            "~=" === e[2] && (e[3] = " " + e[3] + " "),
                                                e.slice(0, 4)
                                        },
                                        CHILD: function(e) {
                                            return e[1] = e[1].toLowerCase(),
                                                "nth" === e[1].slice(0, 3) ? (e[3] || t.error(e[0]), e[4] = +(e[4] ? e[5] + (e[6] || 1) : 2 * ("even" === e[3] || "odd" === e[3])), e[5] = +(e[7] + e[8] || "odd" === e[3])) : e[3] && t.error(e[0]),
                                                e
                                        },
                                        PSEUDO: function(e) {
                                            var t, n = !e[6] && e[2];
                                            return fe.CHILD.test(e[0]) ? null: (e[3] ? e[2] = e[4] || e[5] || "": n && ue.test(n) && (t = T(n, !0)) && (t = n.indexOf(")", n.length - t) - n.length) && (e[0] = e[0].slice(0, t), e[2] = n.slice(0, t)), e.slice(0, 3))
                                        }
                                    },
                                    filter: {
                                        TAG: function(e) {
                                            var t = e.replace(ye, me).toLowerCase();
                                            return "*" === e ?
                                                function() {
                                                    return ! 0
                                                }: function(e) {
                                                    return e.nodeName && e.nodeName.toLowerCase() === t
                                                }
                                        },
                                        CLASS: function(e) {
                                            var t = W[e + " "];
                                            return t || (t = new RegExp("(^|" + ee + ")" + e + "(" + ee + "|$)")) && W(e,
                                                function(e) {
                                                    return t.test("string" == typeof e.className && e.className || void 0 !== e.getAttribute && e.getAttribute("class") || "")
                                                })
                                        },
                                        ATTR: function(e, n, r) {
                                            return function(i) {
                                                var o = t.attr(i, e);
                                                return null == o ? "!=" === n: !n || (o += "", "=" === n ? o === r: "!=" === n ? o !== r: "^=" === n ? r && 0 === o.indexOf(r) : "*=" === n ? r && o.indexOf(r) > -1 : "$=" === n ? r && o.slice( - r.length) === r: "~=" === n ? (" " + o.replace(ie, " ") + " ").indexOf(r) > -1 : "|=" === n && (o === r || o.slice(0, r.length + 1) === r + "-"))
                                            }
                                        },
                                        CHILD: function(e, t, n, r, i) {
                                            var o = "nth" !== e.slice(0, 3),
                                                a = "last" !== e.slice( - 4),
                                                s = "of-type" === t;
                                            return 1 === r && 0 === i ?
                                                function(e) {
                                                    return !! e.parentNode
                                                }: function(t, n, c) {
                                                    var u, l, f, p, d, h, g = o !== a ? "nextSibling": "previousSibling",
                                                        v = t.parentNode,
                                                        y = s && t.nodeName.toLowerCase(),
                                                        m = !c && !s,
                                                        x = !1;
                                                    if (v) {
                                                        if (o) {
                                                            for (; g;) {
                                                                for (p = t; p = p[g];) if (s ? p.nodeName.toLowerCase() === y: 1 === p.nodeType) return ! 1;
                                                                h = g = "only" === e && !h && "nextSibling"
                                                            }
                                                            return ! 0
                                                        }
                                                        if (h = [a ? v.firstChild: v.lastChild], a && m) {
                                                            for (p = v, f = p[q] || (p[q] = {}), l = f[p.uniqueID] || (f[p.uniqueID] = {}), u = l[e] || [], d = u[0] === I && u[1], x = d && u[2], p = d && v.childNodes[d]; p = ++d && p && p[g] || (x = d = 0) || h.pop();) if (1 === p.nodeType && ++x && p === t) {
                                                                l[e] = [I, d, x];
                                                                break
                                                            }
                                                        } else if (m && (p = t, f = p[q] || (p[q] = {}), l = f[p.uniqueID] || (f[p.uniqueID] = {}), u = l[e] || [], d = u[0] === I && u[1], x = d), !1 === x) for (; (p = ++d && p && p[g] || (x = d = 0) || h.pop()) && ((s ? p.nodeName.toLowerCase() !== y: 1 !== p.nodeType) || !++x || (m && (f = p[q] || (p[q] = {}), l = f[p.uniqueID] || (f[p.uniqueID] = {}), l[e] = [I, x]), p !== t)););
                                                        return (x -= i) === r || x % r == 0 && x / r >= 0
                                                    }
                                                }
                                        },
                                        PSEUDO: function(e, n) {
                                            var i, o = w.pseudos[e] || w.setFilters[e.toLowerCase()] || t.error("unsupported pseudo: " + e);
                                            return o[q] ? o(n) : o.length > 1 ? (i = [e, e, "", n], w.setFilters.hasOwnProperty(e.toLowerCase()) ? r(function(e, t) {
                                                for (var r, i = o(e, n), a = i.length; a--;) r = J(e, i[a]),
                                                    e[r] = !(t[r] = i[a])
                                            }) : function(e) {
                                                return o(e, 0, i)
                                            }) : o
                                        }
                                    },
                                    pseudos: {
                                        not: r(function(e) {
                                            var t = [],
                                                n = [],
                                                i = C(e.replace(oe, "$1"));
                                            return i[q] ? r(function(e, t, n, r) {
                                                for (var o, a = i(e, null, r, []), s = e.length; s--;)(o = a[s]) && (e[s] = !(t[s] = o))
                                            }) : function(e, r, o) {
                                                return t[0] = e,
                                                    i(t, null, o, n),
                                                    t[0] = null,
                                                    !n.pop()
                                            }
                                        }),
                                        has: r(function(e) {
                                            return function(n) {
                                                return t(e, n).length > 0
                                            }
                                        }),
                                        contains: r(function(e) {
                                            return e = e.replace(ye, me),
                                                function(t) {
                                                    return (t.textContent || t.innerText || _(t)).indexOf(e) > -1
                                                }
                                        }),
                                        lang: r(function(e) {
                                            return le.test(e || "") || t.error("unsupported lang: " + e),
                                                e = e.replace(ye, me).toLowerCase(),
                                                function(t) {
                                                    var n;
                                                    do {
                                                        if (n = O ? t.lang: t.getAttribute("xml:lang") || t.getAttribute("lang")) return (n = n.toLowerCase()) === e || 0 === n.indexOf(e + "-")
                                                    } while (( t = t . parentNode ) && 1 === t.nodeType);
                                                    return ! 1
                                                }
                                        }),
                                        target: function(t) {
                                            var n = e.location && e.location.hash;
                                            return n && n.slice(1) === t.id
                                        },
                                        root: function(e) {
                                            return e === L
                                        },
                                        focus: function(e) {
                                            return e === D.activeElement && (!D.hasFocus || D.hasFocus()) && !!(e.type || e.href || ~e.tabIndex)
                                        },
                                        enabled: s(!1),
                                        disabled: s(!0),
                                        checked: function(e) {
                                            var t = e.nodeName.toLowerCase();
                                            return "input" === t && !!e.checked || "option" === t && !!e.selected
                                        },
                                        selected: function(e) {
                                            return e.parentNode && e.parentNode.selectedIndex,
                                            !0 === e.selected
                                        },
                                        empty: function(e) {
                                            for (e = e.firstChild; e; e = e.nextSibling) if (e.nodeType < 6) return ! 1;
                                            return ! 0
                                        },
                                        parent: function(e) {
                                            return ! w.pseudos.empty(e)
                                        },
                                        header: function(e) {
                                            return de.test(e.nodeName)
                                        },
                                        input: function(e) {
                                            return pe.test(e.nodeName)
                                        },
                                        button: function(e) {
                                            var t = e.nodeName.toLowerCase();
                                            return "input" === t && "button" === e.type || "button" === t
                                        },
                                        text: function(e) {
                                            var t;
                                            return "input" === e.nodeName.toLowerCase() && "text" === e.type && (null == (t = e.getAttribute("type")) || "text" === t.toLowerCase())
                                        },
                                        first: c(function() {
                                            return [0]
                                        }),
                                        last: c(function(e, t) {
                                            return [t - 1]
                                        }),
                                        eq: c(function(e, t, n) {
                                            return [n < 0 ? n + t: n]
                                        }),
                                        even: c(function(e, t) {
                                            for (var n = 0; n < t; n += 2) e.push(n);
                                            return e
                                        }),
                                        odd: c(function(e, t) {
                                            for (var n = 1; n < t; n += 2) e.push(n);
                                            return e
                                        }),
                                        lt: c(function(e, t, n) {
                                            for (var r = n < 0 ? n + t: n; --r >= 0;) e.push(r);
                                            return e
                                        }),
                                        gt: c(function(e, t, n) {
                                            for (var r = n < 0 ? n + t: n; ++r < t;) e.push(r);
                                            return e
                                        })
                                    }
                                },
                                w.pseudos.nth = w.pseudos.eq;
                            for (x in {
                                radio: !0,
                                checkbox: !0,
                                file: !0,
                                password: !0,
                                image: !0
                            }) w.pseudos[x] = function(e) {
                                return function(t) {
                                    return "input" === t.nodeName.toLowerCase() && t.type === e
                                }
                            } (x);
                            for (x in {
                                submit: !0,
                                reset: !0
                            }) w.pseudos[x] = function(e) {
                                return function(t) {
                                    var n = t.nodeName.toLowerCase();
                                    return ("input" === n || "button" === n) && t.type === e
                                }
                            } (x);
                            return l.prototype = w.filters = w.pseudos,
                                w.setFilters = new l,
                                T = t.tokenize = function(e, n) {
                                    var r, i, o, a, s, c, u, l = U[e + " "];
                                    if (l) return n ? 0 : l.slice(0);
                                    for (s = e, c = [], u = w.preFilter; s;) {
                                        r && !(i = ae.exec(s)) || (i && (s = s.slice(i[0].length) || s), c.push(o = [])),
                                            r = !1,
                                        (i = se.exec(s)) && (r = i.shift(), o.push({
                                            value: r,
                                            type: i[0].replace(oe, " ")
                                        }), s = s.slice(r.length));
                                        for (a in w.filter) ! (i = fe[a].exec(s)) || u[a] && !(i = u[a](i)) || (r = i.shift(), o.push({
                                            value: r,
                                            type: a,
                                            matches: i
                                        }), s = s.slice(r.length));
                                        if (!r) break
                                    }
                                    return n ? s.length: s ? t.error(e) : U(e, c).slice(0)
                                },
                                C = t.compile = function(e, t) {
                                    var n, r = [],
                                        i = [],
                                        o = z[e + " "];
                                    if (!o) {
                                        for (t || (t = T(e)), n = t.length; n--;) o = y(t[n]),
                                            o[q] ? r.push(o) : i.push(o);
                                        o = z(e, m(i, r)),
                                            o.selector = e
                                    }
                                    return o
                                },
                                S = t.select = function(e, t, n, r) {
                                    var i, o, a, s, c, l = "function" == typeof e && e,
                                        p = !r && T(e = l.selector || e);
                                    if (n = n || [], 1 === p.length) {
                                        if (o = p[0] = p[0].slice(0), o.length > 2 && "ID" === (a = o[0]).type && 9 === t.nodeType && O && w.relative[o[1].type]) {
                                            if (! (t = (w.find.ID(a.matches[0].replace(ye, me), t) || [])[0])) return n;
                                            l && (t = t.parentNode),
                                                e = e.slice(o.shift().value.length)
                                        }
                                        for (i = fe.needsContext.test(e) ? 0 : o.length; i--&&(a = o[i], !w.relative[s = a.type]);) if ((c = w.find[s]) && (r = c(a.matches[0].replace(ye, me), ve.test(o[0].type) && u(t.parentNode) || t))) {
                                            if (o.splice(i, 1), !(e = r.length && f(o))) return X.apply(n, r),
                                                n;
                                            break
                                        }
                                    }
                                    return (l || C(e, p))(r, t, !O, n, !t || ve.test(e) && u(t.parentNode) || t),
                                        n
                                },
                                b.sortStable = q.split("").sort(K).join("") === q,
                                b.detectDuplicates = !!j,
                                N(),
                                b.sortDetached = i(function(e) {
                                    return 1 & e.compareDocumentPosition(D.createElement("fieldset"))
                                }),
                            i(function(e) {
                                return e.innerHTML = "<a href='#'></a>",
                                "#" === e.firstChild.getAttribute("href")
                            }) || o("type|href|height|width",
                                function(e, t, n) {
                                    if (!n) return e.getAttribute(t, "type" === t.toLowerCase() ? 1 : 2)
                                }),
                            b.attributes && i(function(e) {
                                return e.innerHTML = "<input/>",
                                    e.firstChild.setAttribute("value", ""),
                                "" === e.firstChild.getAttribute("value")
                            }) || o("value",
                                function(e, t, n) {
                                    if (!n && "input" === e.nodeName.toLowerCase()) return e.defaultValue
                                }),
                            i(function(e) {
                                return null == e.getAttribute("disabled")
                            }) || o(Z,
                                function(e, t, n) {
                                    var r;
                                    if (!n) return ! 0 === e[t] ? t.toLowerCase() : (r = e.getAttributeNode(t)) && r.specified ? r.value: null
                                }),
                                t
                        } (o);
                        we.find = Se,
                            we.expr = Se.selectors,
                            we.expr[":"] = we.expr.pseudos,
                            we.uniqueSort = we.unique = Se.uniqueSort,
                            we.text = Se.getText,
                            we.isXMLDoc = Se.isXML,
                            we.contains = Se.contains,
                            we.escapeSelector = Se.escape;
                        var Ae = function(e, t, n) {
                                for (var r = [], i = void 0 !== n; (e = e[t]) && 9 !== e.nodeType;) if (1 === e.nodeType) {
                                    if (i && we(e).is(n)) break;
                                    r.push(e)
                                }
                                return r
                            },
                            Ee = function(e, t) {
                                for (var n = []; e; e = e.nextSibling) 1 === e.nodeType && e !== t && n.push(e);
                                return n
                            },
                            je = we.expr.match.needsContext,
                            Ne = /^<([a-z][^\/\0>:\x20\t\r\n\f]*)[\x20\t\r\n\f]*\/?>(?:<\/\1>|)$/i,
                            De = /^.[^:#\[\.,]*$/;
                        we.filter = function(e, t, n) {
                            var r = t[0];
                            return n && (e = ":not(" + e + ")"),
                                1 === t.length && 1 === r.nodeType ? we.find.matchesSelector(r, e) ? [r] : [] : we.find.matches(e, we.grep(t,
                                    function(e) {
                                        return 1 === e.nodeType
                                    }))
                        },
                            we.fn.extend({
                                find: function(e) {
                                    var t, n, r = this.length,
                                        i = this;
                                    if ("string" != typeof e) return this.pushStack(we(e).filter(function() {
                                        for (t = 0; t < r; t++) if (we.contains(i[t], this)) return ! 0
                                    }));
                                    for (n = this.pushStack([]), t = 0; t < r; t++) we.find(e, i[t], n);
                                    return r > 1 ? we.uniqueSort(n) : n
                                },
                                filter: function(e) {
                                    return this.pushStack(f(this, e || [], !1))
                                },
                                not: function(e) {
                                    return this.pushStack(f(this, e || [], !0))
                                },
                                is: function(e) {
                                    return !! f(this, "string" == typeof e && je.test(e) ? we(e) : e || [], !1).length
                                }
                            });
                        var Le, Oe = /^(?:\s*(<[\w\W]+>)[^>]*|#([\w-]+))$/; (we.fn.init = function(e, t, n) {
                            var r, i;
                            if (!e) return this;
                            if (n = n || Le, "string" == typeof e) {
                                if (! (r = "<" === e[0] && ">" === e[e.length - 1] && e.length >= 3 ? [null, e, null] : Oe.exec(e)) || !r[1] && t) return ! t || t.jquery ? (t || n).find(e) : this.constructor(t).find(e);
                                if (r[1]) {
                                    if (t = t instanceof we ? t[0] : t, we.merge(this, we.parseHTML(r[1], t && t.nodeType ? t.ownerDocument || t: ce, !0)), Ne.test(r[1]) && we.isPlainObject(t)) for (r in t) we.isFunction(this[r]) ? this[r](t[r]) : this.attr(r, t[r]);
                                    return this
                                }
                                return i = ce.getElementById(r[2]),
                                i && (this[0] = i, this.length = 1),
                                    this
                            }
                            return e.nodeType ? (this[0] = e, this.length = 1, this) : we.isFunction(e) ? void 0 !== n.ready ? n.ready(e) : e(we) : we.makeArray(e, this)
                        }).prototype = we.fn,
                            Le = we(ce);
                        var Pe = /^(?:parents|prev(?:Until|All))/,
                            Fe = {
                                children: !0,
                                contents: !0,
                                next: !0,
                                prev: !0
                            };
                        we.fn.extend({
                            has: function(e) {
                                var t = we(e, this),
                                    n = t.length;
                                return this.filter(function() {
                                    for (var e = 0; e < n; e++) if (we.contains(this, t[e])) return ! 0
                                })
                            },
                            closest: function(e, t) {
                                var n, r = 0,
                                    i = this.length,
                                    o = [],
                                    a = "string" != typeof e && we(e);
                                if (!je.test(e)) for (; r < i; r++) for (n = this[r]; n && n !== t; n = n.parentNode) if (n.nodeType < 11 && (a ? a.index(n) > -1 : 1 === n.nodeType && we.find.matchesSelector(n, e))) {
                                    o.push(n);
                                    break
                                }
                                return this.pushStack(o.length > 1 ? we.uniqueSort(o) : o)
                            },
                            index: function(e) {
                                return e ? "string" == typeof e ? de.call(we(e), this[0]) : de.call(this, e.jquery ? e[0] : e) : this[0] && this[0].parentNode ? this.first().prevAll().length: -1
                            },
                            add: function(e, t) {
                                return this.pushStack(we.uniqueSort(we.merge(this.get(), we(e, t))))
                            },
                            addBack: function(e) {
                                return this.add(null == e ? this.prevObject: this.prevObject.filter(e))
                            }
                        }),
                            we.each({
                                    parent: function(e) {
                                        var t = e.parentNode;
                                        return t && 11 !== t.nodeType ? t: null
                                    },
                                    parents: function(e) {
                                        return Ae(e, "parentNode")
                                    },
                                    parentsUntil: function(e, t, n) {
                                        return Ae(e, "parentNode", n)
                                    },
                                    next: function(e) {
                                        return p(e, "nextSibling")
                                    },
                                    prev: function(e) {
                                        return p(e, "previousSibling")
                                    },
                                    nextAll: function(e) {
                                        return Ae(e, "nextSibling")
                                    },
                                    prevAll: function(e) {
                                        return Ae(e, "previousSibling")
                                    },
                                    nextUntil: function(e, t, n) {
                                        return Ae(e, "nextSibling", n)
                                    },
                                    prevUntil: function(e, t, n) {
                                        return Ae(e, "previousSibling", n)
                                    },
                                    siblings: function(e) {
                                        return Ee((e.parentNode || {}).firstChild, e)
                                    },
                                    children: function(e) {
                                        return Ee(e.firstChild)
                                    },
                                    contents: function(e) {
                                        return l(e, "iframe") ? e.contentDocument: (l(e, "template") && (e = e.content || e), we.merge([], e.childNodes))
                                    }
                                },
                                function(e, t) {
                                    we.fn[e] = function(n, r) {
                                        var i = we.map(this, t, n);
                                        return "Until" !== e.slice( - 5) && (r = n),
                                        r && "string" == typeof r && (i = we.filter(r, i)),
                                        this.length > 1 && (Fe[e] || we.uniqueSort(i), Pe.test(e) && i.reverse()),
                                            this.pushStack(i)
                                    }
                                });
                        var Me = /[^\x20\t\r\n\f]+/g;
                        we.Callbacks = function(e) {
                            e = "string" == typeof e ? d(e) : we.extend({},
                                e);
                            var t, n, r, i, o = [],
                                a = [],
                                s = -1,
                                c = function() {
                                    for (i = i || e.once, r = t = !0; a.length; s = -1) for (n = a.shift(); ++s < o.length;) ! 1 === o[s].apply(n[0], n[1]) && e.stopOnFalse && (s = o.length, n = !1);
                                    e.memory || (n = !1),
                                        t = !1,
                                    i && (o = n ? [] : "")
                                },
                                u = {
                                    add: function() {
                                        return o && (n && !t && (s = o.length - 1, a.push(n)),
                                            function t(n) {
                                                we.each(n,
                                                    function(n, r) {
                                                        we.isFunction(r) ? e.unique && u.has(r) || o.push(r) : r && r.length && "string" !== we.type(r) && t(r)
                                                    })
                                            } (arguments), n && !t && c()),
                                            this
                                    },
                                    remove: function() {
                                        return we.each(arguments,
                                            function(e, t) {
                                                for (var n; (n = we.inArray(t, o, n)) > -1;) o.splice(n, 1),
                                                n <= s && s--
                                            }),
                                            this
                                    },
                                    has: function(e) {
                                        return e ? we.inArray(e, o) > -1 : o.length > 0
                                    },
                                    empty: function() {
                                        return o && (o = []),
                                            this
                                    },
                                    disable: function() {
                                        return i = a = [],
                                            o = n = "",
                                            this
                                    },
                                    disabled: function() {
                                        return ! o
                                    },
                                    lock: function() {
                                        return i = a = [],
                                        n || t || (o = n = ""),
                                            this
                                    },
                                    locked: function() {
                                        return !! i
                                    },
                                    fireWith: function(e, n) {
                                        return i || (n = n || [], n = [e, n.slice ? n.slice() : n], a.push(n), t || c()),
                                            this
                                    },
                                    fire: function() {
                                        return u.fireWith(this, arguments),
                                            this
                                    },
                                    fired: function() {
                                        return !! r
                                    }
                                };
                            return u
                        },
                            we.extend({
                                Deferred: function(e) {
                                    var t = [["notify", "progress", we.Callbacks("memory"), we.Callbacks("memory"), 2], ["resolve", "done", we.Callbacks("once memory"), we.Callbacks("once memory"), 0, "resolved"], ["reject", "fail", we.Callbacks("once memory"), we.Callbacks("once memory"), 1, "rejected"]],
                                        n = "pending",
                                        r = {
                                            state: function() {
                                                return n
                                            },
                                            always: function() {
                                                return i.done(arguments).fail(arguments),
                                                    this
                                            },
                                            catch: function(e) {
                                                return r.then(null, e)
                                            },
                                            pipe: function() {
                                                var e = arguments;
                                                return we.Deferred(function(n) {
                                                    we.each(t,
                                                        function(t, r) {
                                                            var o = we.isFunction(e[r[4]]) && e[r[4]];
                                                            i[r[1]](function() {
                                                                var e = o && o.apply(this, arguments);
                                                                e && we.isFunction(e.promise) ? e.promise().progress(n.notify).done(n.resolve).fail(n.reject) : n[r[0] + "With"](this, o ? [e] : arguments)
                                                            })
                                                        }),
                                                        e = null
                                                }).promise()
                                            },
                                            then: function(e, n, r) {
                                                function i(e, t, n, r) {
                                                    return function() {
                                                        var c = this,
                                                            u = arguments,
                                                            l = function() {
                                                                var o, l;
                                                                if (! (e < s)) {
                                                                    if ((o = n.apply(c, u)) === t.promise()) throw new TypeError("Thenable self-resolution");
                                                                    l = o && ("object" == (void 0 === o ? "undefined": (0, a.
                                                                        default)(o)) || "function" == typeof o) && o.then,
                                                                        we.isFunction(l) ? r ? l.call(o, i(s, t, h, r), i(s, t, g, r)) : (s++, l.call(o, i(s, t, h, r), i(s, t, g, r), i(s, t, h, t.notifyWith))) : (n !== h && (c = void 0, u = [o]), (r || t.resolveWith)(c, u))
                                                                }
                                                            },
                                                            f = r ? l: function() {
                                                                try {
                                                                    l()
                                                                } catch(r) {
                                                                    we.Deferred.exceptionHook && we.Deferred.exceptionHook(r, f.stackTrace),
                                                                    e + 1 >= s && (n !== g && (c = void 0, u = [r]), t.rejectWith(c, u))
                                                                }
                                                            };
                                                        e ? f() : (we.Deferred.getStackHook && (f.stackTrace = we.Deferred.getStackHook()), o.setTimeout(f))
                                                    }
                                                }
                                                var s = 0;
                                                return we.Deferred(function(o) {
                                                    t[0][3].add(i(0, o, we.isFunction(r) ? r: h, o.notifyWith)),
                                                        t[1][3].add(i(0, o, we.isFunction(e) ? e: h)),
                                                        t[2][3].add(i(0, o, we.isFunction(n) ? n: g))
                                                }).promise()
                                            },
                                            promise: function(e) {
                                                return null != e ? we.extend(e, r) : r
                                            }
                                        },
                                        i = {};
                                    return we.each(t,
                                        function(e, o) {
                                            var a = o[2],
                                                s = o[5];
                                            r[o[1]] = a.add,
                                            s && a.add(function() {
                                                    n = s
                                                },
                                                t[3 - e][2].disable, t[0][2].lock),
                                                a.add(o[3].fire),
                                                i[o[0]] = function() {
                                                    return i[o[0] + "With"](this === i ? void 0 : this, arguments),
                                                        this
                                                },
                                                i[o[0] + "With"] = a.fireWith
                                        }),
                                        r.promise(i),
                                    e && e.call(i, i),
                                        i
                                },
                                when: function(e) {
                                    var t = arguments.length,
                                        n = t,
                                        r = Array(n),
                                        i = le.call(arguments),
                                        o = we.Deferred(),
                                        a = function(e) {
                                            return function(n) {
                                                r[e] = this,
                                                    i[e] = arguments.length > 1 ? le.call(arguments) : n,
                                                --t || o.resolveWith(r, i)
                                            }
                                        };
                                    if (t <= 1 && (v(e, o.done(a(n)).resolve, o.reject, !t), "pending" === o.state() || we.isFunction(i[n] && i[n].then))) return o.then();
                                    for (; n--;) v(i[n], a(n), o.reject);
                                    return o.promise()
                                }
                            });
                        var Re = /^(Eval|Internal|Range|Reference|Syntax|Type|URI)Error$/;
                        we.Deferred.exceptionHook = function(e, t) {
                            o.console && o.console.warn && e && Re.test(e.name) && o.console.warn("jQuery.Deferred exception: " + e.message, e.stack, t)
                        },
                            we.readyException = function(e) {
                                o.setTimeout(function() {
                                    throw e
                                })
                            };
                        var qe = we.Deferred();
                        we.fn.ready = function(e) {
                            return qe.then(e).
                            catch(function(e) {
                                we.readyException(e)
                            }),
                                this
                        },
                            we.extend({
                                isReady: !1,
                                readyWait: 1,
                                ready: function(e) { (!0 === e ? --we.readyWait: we.isReady) || (we.isReady = !0, !0 !== e && --we.readyWait > 0 || qe.resolveWith(ce, [we]))
                                }
                            }),
                            we.ready.then = qe.then,
                            "complete" === ce.readyState || "loading" !== ce.readyState && !ce.documentElement.doScroll ? o.setTimeout(we.ready) : (ce.addEventListener("DOMContentLoaded", y), o.addEventListener("load", y));
                        var He = function e(t, n, r, i, o, a, s) {
                                var c = 0,
                                    u = t.length,
                                    l = null == r;
                                if ("object" === we.type(r)) {
                                    o = !0;
                                    for (c in r) e(t, n, c, r[c], !0, a, s)
                                } else if (void 0 !== i && (o = !0, we.isFunction(i) || (s = !0), l && (s ? (n.call(t, i), n = null) : (l = n, n = function(e, t, n) {
                                        return l.call(we(e), n)
                                    })), n)) for (; c < u; c++) n(t[c], r, s ? i: i.call(t[c], c, n(t[c], r)));
                                return o ? t: l ? n.call(t) : u ? n(t[0], r) : a
                            },
                            Ie = function(e) {
                                return 1 === e.nodeType || 9 === e.nodeType || !+e.nodeType
                            };
                        m.uid = 1,
                            m.prototype = {
                                cache: function(e) {
                                    var t = e[this.expando];
                                    return t || (t = {},
                                    Ie(e) && (e.nodeType ? e[this.expando] = t: Object.defineProperty(e, this.expando, {
                                        value: t,
                                        configurable: !0
                                    }))),
                                        t
                                },
                                set: function(e, t, n) {
                                    var r, i = this.cache(e);
                                    if ("string" == typeof t) i[we.camelCase(t)] = n;
                                    else for (r in t) i[we.camelCase(r)] = t[r];
                                    return i
                                },
                                get: function(e, t) {
                                    return void 0 === t ? this.cache(e) : e[this.expando] && e[this.expando][we.camelCase(t)]
                                },
                                access: function(e, t, n) {
                                    return void 0 === t || t && "string" == typeof t && void 0 === n ? this.get(e, t) : (this.set(e, t, n), void 0 !== n ? n: t)
                                },
                                remove: function(e, t) {
                                    var n, r = e[this.expando];
                                    if (void 0 !== r) {
                                        if (void 0 !== t) {
                                            Array.isArray(t) ? t = t.map(we.camelCase) : (t = we.camelCase(t), t = t in r ? [t] : t.match(Me) || []),
                                                n = t.length;
                                            for (; n--;) delete r[t[n]]
                                        } (void 0 === t || we.isEmptyObject(r)) && (e.nodeType ? e[this.expando] = void 0 : delete e[this.expando])
                                    }
                                },
                                hasData: function(e) {
                                    var t = e[this.expando];
                                    return void 0 !== t && !we.isEmptyObject(t)
                                }
                            };
                        var Be = new m,
                            We = new m,
                            Ue = /^(?:\{[\w\W]*\}|\[[\w\W]*\])$/,
                            ze = /[A-Z]/g;
                        we.extend({
                            hasData: function(e) {
                                return We.hasData(e) || Be.hasData(e)
                            },
                            data: function(e, t, n) {
                                return We.access(e, t, n)
                            },
                            removeData: function(e, t) {
                                We.remove(e, t)
                            },
                            _data: function(e, t, n) {
                                return Be.access(e, t, n)
                            },
                            _removeData: function(e, t) {
                                Be.remove(e, t)
                            }
                        }),
                            we.fn.extend({
                                data: function(e, t) {
                                    var n, r, i, o = this[0],
                                        s = o && o.attributes;
                                    if (void 0 === e) {
                                        if (this.length && (i = We.get(o), 1 === o.nodeType && !Be.get(o, "hasDataAttrs"))) {
                                            for (n = s.length; n--;) s[n] && (r = s[n].name, 0 === r.indexOf("data-") && (r = we.camelCase(r.slice(5)), b(o, r, i[r])));
                                            Be.set(o, "hasDataAttrs", !0)
                                        }
                                        return i
                                    }
                                    return "object" == (void 0 === e ? "undefined": (0, a.
                                        default)(e)) ? this.each(function() {
                                        We.set(this, e)
                                    }) : He(this,
                                        function(t) {
                                            var n;
                                            if (o && void 0 === t) {
                                                if (void 0 !== (n = We.get(o, e))) return n;
                                                if (void 0 !== (n = b(o, e))) return n
                                            } else this.each(function() {
                                                We.set(this, e, t)
                                            })
                                        },
                                        null, t, arguments.length > 1, null, !0)
                                },
                                removeData: function(e) {
                                    return this.each(function() {
                                        We.remove(this, e)
                                    })
                                }
                            }),
                            we.extend({
                                queue: function(e, t, n) {
                                    var r;
                                    if (e) return t = (t || "fx") + "queue",
                                        r = Be.get(e, t),
                                    n && (!r || Array.isArray(n) ? r = Be.access(e, t, we.makeArray(n)) : r.push(n)),
                                    r || []
                                },
                                dequeue: function(e, t) {
                                    t = t || "fx";
                                    var n = we.queue(e, t),
                                        r = n.length,
                                        i = n.shift(),
                                        o = we._queueHooks(e, t),
                                        a = function() {
                                            we.dequeue(e, t)
                                        };
                                    "inprogress" === i && (i = n.shift(), r--),
                                    i && ("fx" === t && n.unshift("inprogress"), delete o.stop, i.call(e, a, o)),
                                    !r && o && o.empty.fire()
                                },
                                _queueHooks: function(e, t) {
                                    var n = t + "queueHooks";
                                    return Be.get(e, n) || Be.access(e, n, {
                                        empty: we.Callbacks("once memory").add(function() {
                                            Be.remove(e, [t + "queue", n])
                                        })
                                    })
                                }
                            }),
                            we.fn.extend({
                                queue: function(e, t) {
                                    var n = 2;
                                    return "string" != typeof e && (t = e, e = "fx", n--),
                                        arguments.length < n ? we.queue(this[0], e) : void 0 === t ? this: this.each(function() {
                                            var n = we.queue(this, e, t);
                                            we._queueHooks(this, e),
                                            "fx" === e && "inprogress" !== n[0] && we.dequeue(this, e)
                                        })
                                },
                                dequeue: function(e) {
                                    return this.each(function() {
                                        we.dequeue(this, e)
                                    })
                                },
                                clearQueue: function(e) {
                                    return this.queue(e || "fx", [])
                                },
                                promise: function(e, t) {
                                    var n, r = 1,
                                        i = we.Deferred(),
                                        o = this,
                                        a = this.length,
                                        s = function() {--r || i.resolveWith(o, [o])
                                        };
                                    for ("string" != typeof e && (t = e, e = void 0), e = e || "fx"; a--;)(n = Be.get(o[a], e + "queueHooks")) && n.empty && (r++, n.empty.add(s));
                                    return s(),
                                        i.promise(t)
                                }
                            });
                        var Ke = /[+-]?(?:\d*\.|)\d+(?:[eE][+-]?\d+|)/.source,
                            $e = new RegExp("^(?:([+-])=|)(" + Ke + ")([a-z%]*)$", "i"),
                            Ve = ["Top", "Right", "Bottom", "Left"],
                            Ge = function(e, t) {
                                return e = t || e,
                                "none" === e.style.display || "" === e.style.display && we.contains(e.ownerDocument, e) && "none" === we.css(e, "display")
                            },
                            Ye = function(e, t, n, r) {
                                var i, o, a = {};
                                for (o in t) a[o] = e.style[o],
                                    e.style[o] = t[o];
                                i = n.apply(e, r || []);
                                for (o in t) e.style[o] = a[o];
                                return i
                            },
                            Xe = {};
                        we.fn.extend({
                            show: function() {
                                return k(this, !0)
                            },
                            hide: function() {
                                return k(this)
                            },
                            toggle: function(e) {
                                return "boolean" == typeof e ? e ? this.show() : this.hide() : this.each(function() {
                                    Ge(this) ? we(this).show() : we(this).hide()
                                })
                            }
                        });
                        var Qe = /^(?:checkbox|radio)$/i,
                            Je = /<([a-z][^\/\0>\x20\t\r\n\f]+)/i,
                            Ze = /^$|\/(?:java|ecma)script/i,
                            et = {
                                option: [1, "<select multiple='multiple'>", "</select>"],
                                thead: [1, "<table>", "</table>"],
                                col: [2, "<table><colgroup>", "</colgroup></table>"],
                                tr: [2, "<table><tbody>", "</tbody></table>"],
                                td: [3, "<table><tbody><tr>", "</tr></tbody></table>"],
                                _default: [0, "", ""]
                            };
                        et.optgroup = et.option,
                            et.tbody = et.tfoot = et.colgroup = et.caption = et.thead,
                            et.th = et.td;
                        var tt = /<|&#?\w+;/; !
                            function() {
                                var e = ce.createDocumentFragment(),
                                    t = e.appendChild(ce.createElement("div")),
                                    n = ce.createElement("input");
                                n.setAttribute("type", "radio"),
                                    n.setAttribute("checked", "checked"),
                                    n.setAttribute("name", "t"),
                                    t.appendChild(n),
                                    xe.checkClone = t.cloneNode(!0).cloneNode(!0).lastChild.checked,
                                    t.innerHTML = "<textarea>x</textarea>",
                                    xe.noCloneChecked = !!t.cloneNode(!0).lastChild.defaultValue
                            } ();
                        var nt = ce.documentElement,
                            rt = /^key/,
                            it = /^(?:mouse|pointer|contextmenu|drag|drop)|click/,
                            ot = /^([^.]*)(?:\.(.+)|)/;
                        we.event = {
                            global: {},
                            add: function(e, t, n, r, i) {
                                var o, a, s, c, u, l, f, p, d, h, g, v = Be.get(e);
                                if (v) for (n.handler && (o = n, n = o.handler, i = o.selector), i && we.find.matchesSelector(nt, i), n.guid || (n.guid = we.guid++), (c = v.events) || (c = v.events = {}), (a = v.handle) || (a = v.handle = function(t) {
                                    return void 0 !== we && we.event.triggered !== t.type ? we.event.dispatch.apply(e, arguments) : void 0
                                }), t = (t || "").match(Me) || [""], u = t.length; u--;) s = ot.exec(t[u]) || [],
                                    d = g = s[1],
                                    h = (s[2] || "").split(".").sort(),
                                d && (f = we.event.special[d] || {},
                                    d = (i ? f.delegateType: f.bindType) || d, f = we.event.special[d] || {},
                                    l = we.extend({
                                            type: d,
                                            origType: g,
                                            data: r,
                                            handler: n,
                                            guid: n.guid,
                                            selector: i,
                                            needsContext: i && we.expr.match.needsContext.test(i),
                                            namespace: h.join(".")
                                        },
                                        o), (p = c[d]) || (p = c[d] = [], p.delegateCount = 0, f.setup && !1 !== f.setup.call(e, r, h, a) || e.addEventListener && e.addEventListener(d, a)), f.add && (f.add.call(e, l), l.handler.guid || (l.handler.guid = n.guid)), i ? p.splice(p.delegateCount++, 0, l) : p.push(l), we.event.global[d] = !0)
                            },
                            remove: function(e, t, n, r, i) {
                                var o, a, s, c, u, l, f, p, d, h, g, v = Be.hasData(e) && Be.get(e);
                                if (v && (c = v.events)) {
                                    for (t = (t || "").match(Me) || [""], u = t.length; u--;) if (s = ot.exec(t[u]) || [], d = g = s[1], h = (s[2] || "").split(".").sort(), d) {
                                        for (f = we.event.special[d] || {},
                                                 d = (r ? f.delegateType: f.bindType) || d, p = c[d] || [], s = s[2] && new RegExp("(^|\\.)" + h.join("\\.(?:.*\\.|)") + "(\\.|$)"), a = o = p.length; o--;) l = p[o],
                                        !i && g !== l.origType || n && n.guid !== l.guid || s && !s.test(l.namespace) || r && r !== l.selector && ("**" !== r || !l.selector) || (p.splice(o, 1), l.selector && p.delegateCount--, f.remove && f.remove.call(e, l));
                                        a && !p.length && (f.teardown && !1 !== f.teardown.call(e, h, v.handle) || we.removeEvent(e, d, v.handle), delete c[d])
                                    } else for (d in c) we.event.remove(e, d + t[u], n, r, !0);
                                    we.isEmptyObject(c) && Be.remove(e, "handle events")
                                }
                            },
                            dispatch: function(e) {
                                var t, n, r, i, o, a, s = we.event.fix(e),
                                    c = new Array(arguments.length),
                                    u = (Be.get(this, "events") || {})[s.type] || [],
                                    l = we.event.special[s.type] || {};
                                for (c[0] = s, t = 1; t < arguments.length; t++) c[t] = arguments[t];
                                if (s.delegateTarget = this, !l.preDispatch || !1 !== l.preDispatch.call(this, s)) {
                                    for (a = we.event.handlers.call(this, s, u), t = 0; (i = a[t++]) && !s.isPropagationStopped();) for (s.currentTarget = i.elem, n = 0; (o = i.handlers[n++]) && !s.isImmediatePropagationStopped();) s.rnamespace && !s.rnamespace.test(o.namespace) || (s.handleObj = o, s.data = o.data, void 0 !== (r = ((we.event.special[o.origType] || {}).handle || o.handler).apply(i.elem, c)) && !1 === (s.result = r) && (s.preventDefault(), s.stopPropagation()));
                                    return l.postDispatch && l.postDispatch.call(this, s),
                                        s.result
                                }
                            },
                            handlers: function(e, t) {
                                var n, r, i, o, a, s = [],
                                    c = t.delegateCount,
                                    u = e.target;
                                if (c && u.nodeType && !("click" === e.type && e.button >= 1)) for (; u !== this; u = u.parentNode || this) if (1 === u.nodeType && ("click" !== e.type || !0 !== u.disabled)) {
                                    for (o = [], a = {},
                                             n = 0; n < c; n++) r = t[n],
                                        i = r.selector + " ",
                                    void 0 === a[i] && (a[i] = r.needsContext ? we(i, this).index(u) > -1 : we.find(i, this, null, [u]).length),
                                    a[i] && o.push(r);
                                    o.length && s.push({
                                        elem: u,
                                        handlers: o
                                    })
                                }
                                return u = this,
                                c < t.length && s.push({
                                    elem: u,
                                    handlers: t.slice(c)
                                }),
                                    s
                            },
                            addProp: function(e, t) {
                                Object.defineProperty(we.Event.prototype, e, {
                                    enumerable: !0,
                                    configurable: !0,
                                    get: we.isFunction(t) ?
                                        function() {
                                            if (this.originalEvent) return t(this.originalEvent)
                                        }: function() {
                                            if (this.originalEvent) return this.originalEvent[e]
                                        },
                                    set: function(t) {
                                        Object.defineProperty(this, e, {
                                            enumerable: !0,
                                            configurable: !0,
                                            writable: !0,
                                            value: t
                                        })
                                    }
                                })
                            },
                            fix: function(e) {
                                return e[we.expando] ? e: new we.Event(e)
                            },
                            special: {
                                load: {
                                    noBubble: !0
                                },
                                focus: {
                                    trigger: function() {
                                        if (this !== j() && this.focus) return this.focus(),
                                            !1
                                    },
                                    delegateType: "focusin"
                                },
                                blur: {
                                    trigger: function() {
                                        if (this === j() && this.blur) return this.blur(),
                                            !1
                                    },
                                    delegateType: "focusout"
                                },
                                click: {
                                    trigger: function() {
                                        if ("checkbox" === this.type && this.click && l(this, "input")) return this.click(),
                                            !1
                                    },
                                    _default: function(e) {
                                        return l(e.target, "a")
                                    }
                                },
                                beforeunload: {
                                    postDispatch: function(e) {
                                        void 0 !== e.result && e.originalEvent && (e.originalEvent.returnValue = e.result)
                                    }
                                }
                            }
                        },
                            we.removeEvent = function(e, t, n) {
                                e.removeEventListener && e.removeEventListener(t, n)
                            },
                            we.Event = function(e, t) {
                                return this instanceof we.Event ? (e && e.type ? (this.originalEvent = e, this.type = e.type, this.isDefaultPrevented = e.defaultPrevented || void 0 === e.defaultPrevented && !1 === e.returnValue ? A: E, this.target = e.target && 3 === e.target.nodeType ? e.target.parentNode: e.target, this.currentTarget = e.currentTarget, this.relatedTarget = e.relatedTarget) : this.type = e, t && we.extend(this, t), this.timeStamp = e && e.timeStamp || we.now(), void(this[we.expando] = !0)) : new we.Event(e, t)
                            },
                            we.Event.prototype = {
                                constructor: we.Event,
                                isDefaultPrevented: E,
                                isPropagationStopped: E,
                                isImmediatePropagationStopped: E,
                                isSimulated: !1,
                                preventDefault: function() {
                                    var e = this.originalEvent;
                                    this.isDefaultPrevented = A,
                                    e && !this.isSimulated && e.preventDefault()
                                },
                                stopPropagation: function() {
                                    var e = this.originalEvent;
                                    this.isPropagationStopped = A,
                                    e && !this.isSimulated && e.stopPropagation()
                                },
                                stopImmediatePropagation: function() {
                                    var e = this.originalEvent;
                                    this.isImmediatePropagationStopped = A,
                                    e && !this.isSimulated && e.stopImmediatePropagation(),
                                        this.stopPropagation()
                                }
                            },
                            we.each({
                                    altKey: !0,
                                    bubbles: !0,
                                    cancelable: !0,
                                    changedTouches: !0,
                                    ctrlKey: !0,
                                    detail: !0,
                                    eventPhase: !0,
                                    metaKey: !0,
                                    pageX: !0,
                                    pageY: !0,
                                    shiftKey: !0,
                                    view: !0,
                                    char: !0,
                                    charCode: !0,
                                    key: !0,
                                    keyCode: !0,
                                    button: !0,
                                    buttons: !0,
                                    clientX: !0,
                                    clientY: !0,
                                    offsetX: !0,
                                    offsetY: !0,
                                    pointerId: !0,
                                    pointerType: !0,
                                    screenX: !0,
                                    screenY: !0,
                                    targetTouches: !0,
                                    toElement: !0,
                                    touches: !0,
                                    which: function(e) {
                                        var t = e.button;
                                        return null == e.which && rt.test(e.type) ? null != e.charCode ? e.charCode: e.keyCode: !e.which && void 0 !== t && it.test(e.type) ? 1 & t ? 1 : 2 & t ? 3 : 4 & t ? 2 : 0 : e.which
                                    }
                                },
                                we.event.addProp),
                            we.each({
                                    mouseenter: "mouseover",
                                    mouseleave: "mouseout",
                                    pointerenter: "pointerover",
                                    pointerleave: "pointerout"
                                },
                                function(e, t) {
                                    we.event.special[e] = {
                                        delegateType: t,
                                        bindType: t,
                                        handle: function(e) {
                                            var n, r = this,
                                                i = e.relatedTarget,
                                                o = e.handleObj;
                                            return i && (i === r || we.contains(r, i)) || (e.type = o.origType, n = o.handler.apply(this, arguments), e.type = t),
                                                n
                                        }
                                    }
                                }),
                            we.fn.extend({
                                on: function(e, t, n, r) {
                                    return N(this, e, t, n, r)
                                },
                                one: function(e, t, n, r) {
                                    return N(this, e, t, n, r, 1)
                                },
                                off: function(e, t, n) {
                                    var r, i;
                                    if (e && e.preventDefault && e.handleObj) return r = e.handleObj,
                                        we(e.delegateTarget).off(r.namespace ? r.origType + "." + r.namespace: r.origType, r.selector, r.handler),
                                        this;
                                    if ("object" == (void 0 === e ? "undefined": (0, a.
                                            default)(e))) {
                                        for (i in e) this.off(i, t, e[i]);
                                        return this
                                    }
                                    return ! 1 !== t && "function" != typeof t || (n = t, t = void 0),
                                    !1 === n && (n = E),
                                        this.each(function() {
                                            we.event.remove(this, e, n, t)
                                        })
                                }
                            });
                        var at = /<(?!area|br|col|embed|hr|img|input|link|meta|param)(([a-z][^\/\0>\x20\t\r\n\f]*)[^>]*)\/>/gi,
                            st = /<script|<style|<link/i,
                            ct = /checked\s*(?:[^=]|=\s*.checked.)/i,
                            ut = /^true\/(.*)/,
                            lt = /^\s*<!(?:\[CDATA\[|--)|(?:\]\]|--)>\s*$/g;
                        we.extend({
                            htmlPrefilter: function(e) {
                                return e.replace(at, "<$1></$2>")
                            },
                            clone: function(e, t, n) {
                                var r, i, o, a, s = e.cloneNode(!0),
                                    c = we.contains(e.ownerDocument, e);
                                if (! (xe.noCloneChecked || 1 !== e.nodeType && 11 !== e.nodeType || we.isXMLDoc(e))) for (a = T(s), o = T(e), r = 0, i = o.length; r < i; r++) F(o[r], a[r]);
                                if (t) if (n) for (o = o || T(e), a = a || T(s), r = 0, i = o.length; r < i; r++) P(o[r], a[r]);
                                else P(e, s);
                                return a = T(s, "script"),
                                a.length > 0 && C(a, !c && T(e, "script")),
                                    s
                            },
                            cleanData: function(e) {
                                for (var t, n, r, i = we.event.special,
                                         o = 0; void 0 !== (n = e[o]); o++) if (Ie(n)) {
                                    if (t = n[Be.expando]) {
                                        if (t.events) for (r in t.events) i[r] ? we.event.remove(n, r) : we.removeEvent(n, r, t.handle);
                                        n[Be.expando] = void 0
                                    }
                                    n[We.expando] && (n[We.expando] = void 0)
                                }
                            }
                        }),
                            we.fn.extend({
                                detach: function(e) {
                                    return R(this, e, !0)
                                },
                                remove: function(e) {
                                    return R(this, e)
                                },
                                text: function(e) {
                                    return He(this,
                                        function(e) {
                                            return void 0 === e ? we.text(this) : this.empty().each(function() {
                                                1 !== this.nodeType && 11 !== this.nodeType && 9 !== this.nodeType || (this.textContent = e)
                                            })
                                        },
                                        null, e, arguments.length)
                                },
                                append: function() {
                                    return M(this, arguments,
                                        function(e) {
                                            if (1 === this.nodeType || 11 === this.nodeType || 9 === this.nodeType) {
                                                D(this, e).appendChild(e)
                                            }
                                        })
                                },
                                prepend: function() {
                                    return M(this, arguments,
                                        function(e) {
                                            if (1 === this.nodeType || 11 === this.nodeType || 9 === this.nodeType) {
                                                var t = D(this, e);
                                                t.insertBefore(e, t.firstChild)
                                            }
                                        })
                                },
                                before: function() {
                                    return M(this, arguments,
                                        function(e) {
                                            this.parentNode && this.parentNode.insertBefore(e, this)
                                        })
                                },
                                after: function() {
                                    return M(this, arguments,
                                        function(e) {
                                            this.parentNode && this.parentNode.insertBefore(e, this.nextSibling)
                                        })
                                },
                                empty: function() {
                                    for (var e, t = 0; null != (e = this[t]); t++) 1 === e.nodeType && (we.cleanData(T(e, !1)), e.textContent = "");
                                    return this
                                },
                                clone: function(e, t) {
                                    return e = null != e && e,
                                        t = null == t ? e: t,
                                        this.map(function() {
                                            return we.clone(this, e, t)
                                        })
                                },
                                html: function(e) {
                                    return He(this,
                                        function(e) {
                                            var t = this[0] || {},
                                                n = 0,
                                                r = this.length;
                                            if (void 0 === e && 1 === t.nodeType) return t.innerHTML;
                                            if ("string" == typeof e && !st.test(e) && !et[(Je.exec(e) || ["", ""])[1].toLowerCase()]) {
                                                e = we.htmlPrefilter(e);
                                                try {
                                                    for (; n < r; n++) t = this[n] || {},
                                                    1 === t.nodeType && (we.cleanData(T(t, !1)), t.innerHTML = e);
                                                    t = 0
                                                } catch(e) {}
                                            }
                                            t && this.empty().append(e)
                                        },
                                        null, e, arguments.length)
                                },
                                replaceWith: function() {
                                    var e = [];
                                    return M(this, arguments,
                                        function(t) {
                                            var n = this.parentNode;
                                            we.inArray(this, e) < 0 && (we.cleanData(T(this)), n && n.replaceChild(t, this))
                                        },
                                        e)
                                }
                            }),
                            we.each({
                                    appendTo: "append",
                                    prependTo: "prepend",
                                    insertBefore: "before",
                                    insertAfter: "after",
                                    replaceAll: "replaceWith"
                                },
                                function(e, t) {
                                    we.fn[e] = function(e) {
                                        for (var n, r = [], i = we(e), o = i.length - 1, a = 0; a <= o; a++) n = a === o ? this: this.clone(!0),
                                            we(i[a])[t](n),
                                            pe.apply(r, n.get());
                                        return this.pushStack(r)
                                    }
                                });
                        var ft = /^margin/,
                            pt = new RegExp("^(" + Ke + ")(?!px)[a-z%]+$", "i"),
                            dt = function(e) {
                                var t = e.ownerDocument.defaultView;
                                return t && t.opener || (t = o),
                                    t.getComputedStyle(e)
                            }; !
                            function() {
                                function e() {
                                    if (s) {
                                        s.style.cssText = "box-sizing:border-box;position:relative;display:block;margin:auto;border:1px;padding:1px;top:1%;width:50%",
                                            s.innerHTML = "",
                                            nt.appendChild(a);
                                        var e = o.getComputedStyle(s);
                                        t = "1%" !== e.top,
                                            i = "2px" === e.marginLeft,
                                            n = "4px" === e.width,
                                            s.style.marginRight = "50%",
                                            r = "4px" === e.marginRight,
                                            nt.removeChild(a),
                                            s = null
                                    }
                                }
                                var t, n, r, i, a = ce.createElement("div"),
                                    s = ce.createElement("div");
                                s.style && (s.style.backgroundClip = "content-box", s.cloneNode(!0).style.backgroundClip = "", xe.clearCloneStyle = "content-box" === s.style.backgroundClip, a.style.cssText = "border:0;width:8px;height:0;top:0;left:-9999px;padding:0;margin-top:1px;position:absolute", a.appendChild(s), we.extend(xe, {
                                    pixelPosition: function() {
                                        return e(),
                                            t
                                    },
                                    boxSizingReliable: function() {
                                        return e(),
                                            n
                                    },
                                    pixelMarginRight: function() {
                                        return e(),
                                            r
                                    },
                                    reliableMarginLeft: function() {
                                        return e(),
                                            i
                                    }
                                }))
                            } ();
                        var ht = /^(none|table(?!-c[ea]).+)/,
                            gt = /^--/,
                            vt = {
                                position: "absolute",
                                visibility: "hidden",
                                display: "block"
                            },
                            yt = {
                                letterSpacing: "0",
                                fontWeight: "400"
                            },
                            mt = ["Webkit", "Moz", "ms"],
                            xt = ce.createElement("div").style;
                        we.extend({
                            cssHooks: {
                                opacity: {
                                    get: function(e, t) {
                                        if (t) {
                                            var n = q(e, "opacity");
                                            return "" === n ? "1": n
                                        }
                                    }
                                }
                            },
                            cssNumber: {
                                animationIterationCount: !0,
                                columnCount: !0,
                                fillOpacity: !0,
                                flexGrow: !0,
                                flexShrink: !0,
                                fontWeight: !0,
                                lineHeight: !0,
                                opacity: !0,
                                order: !0,
                                orphans: !0,
                                widows: !0,
                                zIndex: !0,
                                zoom: !0
                            },
                            cssProps: {
                                float: "cssFloat"
                            },
                            style: function(e, t, n, r) {
                                if (e && 3 !== e.nodeType && 8 !== e.nodeType && e.style) {
                                    var i, o, s, c = we.camelCase(t),
                                        u = gt.test(t),
                                        l = e.style;
                                    return u || (t = B(c)),
                                        s = we.cssHooks[t] || we.cssHooks[c],
                                        void 0 === n ? s && "get" in s && void 0 !== (i = s.get(e, !1, r)) ? i: l[t] : (o = void 0 === n ? "undefined": (0, a.
                                            default)(n), "string" === o && (i = $e.exec(n)) && i[1] && (n = w(e, t, i), o = "number"), void(null != n && n === n && ("number" === o && (n += i && i[3] || (we.cssNumber[c] ? "": "px")), xe.clearCloneStyle || "" !== n || 0 !== t.indexOf("background") || (l[t] = "inherit"), s && "set" in s && void 0 === (n = s.set(e, n, r)) || (u ? l.setProperty(t, n) : l[t] = n))))
                                }
                            },
                            css: function(e, t, n, r) {
                                var i, o, a, s = we.camelCase(t);
                                return gt.test(t) || (t = B(s)),
                                    a = we.cssHooks[t] || we.cssHooks[s],
                                a && "get" in a && (i = a.get(e, !0, n)),
                                void 0 === i && (i = q(e, t, r)),
                                "normal" === i && t in yt && (i = yt[t]),
                                    "" === n || n ? (o = parseFloat(i), !0 === n || isFinite(o) ? o || 0 : i) : i
                            }
                        }),
                            we.each(["height", "width"],
                                function(e, t) {
                                    we.cssHooks[t] = {
                                        get: function(e, n, r) {
                                            if (n) return ! ht.test(we.css(e, "display")) || e.getClientRects().length && e.getBoundingClientRect().width ? z(e, t, r) : Ye(e, vt,
                                                function() {
                                                    return z(e, t, r)
                                                })
                                        },
                                        set: function(e, n, r) {
                                            var i, o = r && dt(e),
                                                a = r && U(e, t, r, "border-box" === we.css(e, "boxSizing", !1, o), o);
                                            return a && (i = $e.exec(n)) && "px" !== (i[3] || "px") && (e.style[t] = n, n = we.css(e, t)),
                                                W(e, n, a)
                                        }
                                    }
                                }),
                            we.cssHooks.marginLeft = H(xe.reliableMarginLeft,
                                function(e, t) {
                                    if (t) return (parseFloat(q(e, "marginLeft")) || e.getBoundingClientRect().left - Ye(e, {
                                            marginLeft: 0
                                        },
                                        function() {
                                            return e.getBoundingClientRect().left
                                        })) + "px"
                                }),
                            we.each({
                                    margin: "",
                                    padding: "",
                                    border: "Width"
                                },
                                function(e, t) {
                                    we.cssHooks[e + t] = {
                                        expand: function(n) {
                                            for (var r = 0,
                                                     i = {},
                                                     o = "string" == typeof n ? n.split(" ") : [n]; r < 4; r++) i[e + Ve[r] + t] = o[r] || o[r - 2] || o[0];
                                            return i
                                        }
                                    },
                                    ft.test(e) || (we.cssHooks[e + t].set = W)
                                }),
                            we.fn.extend({
                                css: function(e, t) {
                                    return He(this,
                                        function(e, t, n) {
                                            var r, i, o = {},
                                                a = 0;
                                            if (Array.isArray(t)) {
                                                for (r = dt(e), i = t.length; a < i; a++) o[t[a]] = we.css(e, t[a], !1, r);
                                                return o
                                            }
                                            return void 0 !== n ? we.style(e, t, n) : we.css(e, t)
                                        },
                                        e, t, arguments.length > 1)
                                }
                            }),
                            we.Tween = K,
                            K.prototype = {
                                constructor: K,
                                init: function(e, t, n, r, i, o) {
                                    this.elem = e,
                                        this.prop = n,
                                        this.easing = i || we.easing._default,
                                        this.options = t,
                                        this.start = this.now = this.cur(),
                                        this.end = r,
                                        this.unit = o || (we.cssNumber[n] ? "": "px")
                                },
                                cur: function() {
                                    var e = K.propHooks[this.prop];
                                    return e && e.get ? e.get(this) : K.propHooks._default.get(this)
                                },
                                run: function(e) {
                                    var t, n = K.propHooks[this.prop];
                                    return this.options.duration ? this.pos = t = we.easing[this.easing](e, this.options.duration * e, 0, 1, this.options.duration) : this.pos = t = e,
                                        this.now = (this.end - this.start) * t + this.start,
                                    this.options.step && this.options.step.call(this.elem, this.now, this),
                                        n && n.set ? n.set(this) : K.propHooks._default.set(this),
                                        this
                                }
                            },
                            K.prototype.init.prototype = K.prototype,
                            K.propHooks = {
                                _default: {
                                    get: function(e) {
                                        var t;
                                        return 1 !== e.elem.nodeType || null != e.elem[e.prop] && null == e.elem.style[e.prop] ? e.elem[e.prop] : (t = we.css(e.elem, e.prop, ""), t && "auto" !== t ? t: 0)
                                    },
                                    set: function(e) {
                                        we.fx.step[e.prop] ? we.fx.step[e.prop](e) : 1 !== e.elem.nodeType || null == e.elem.style[we.cssProps[e.prop]] && !we.cssHooks[e.prop] ? e.elem[e.prop] = e.now: we.style(e.elem, e.prop, e.now + e.unit)
                                    }
                                }
                            },
                            K.propHooks.scrollTop = K.propHooks.scrollLeft = {
                                set: function(e) {
                                    e.elem.nodeType && e.elem.parentNode && (e.elem[e.prop] = e.now)
                                }
                            },
                            we.easing = {
                                linear: function(e) {
                                    return e
                                },
                                swing: function(e) {
                                    return.5 - Math.cos(e * Math.PI) / 2
                                },
                                _default: "swing"
                            },
                            we.fx = K.prototype.init,
                            we.fx.step = {};
                        var bt, wt, _t = /^(?:toggle|show|hide)$/,
                            kt = /queueHooks$/;
                        we.Animation = we.extend(J, {
                            tweeners: {
                                "*": [function(e, t) {
                                    var n = this.createTween(e, t);
                                    return w(n.elem, e, $e.exec(t), n),
                                        n
                                }]
                            },
                            tweener: function(e, t) {
                                we.isFunction(e) ? (t = e, e = ["*"]) : e = e.match(Me);
                                for (var n, r = 0,
                                         i = e.length; r < i; r++) n = e[r],
                                    J.tweeners[n] = J.tweeners[n] || [],
                                    J.tweeners[n].unshift(t)
                            },
                            prefilters: [X],
                            prefilter: function(e, t) {
                                t ? J.prefilters.unshift(e) : J.prefilters.push(e)
                            }
                        }),
                            we.speed = function(e, t, n) {
                                var r = e && "object" == (void 0 === e ? "undefined": (0, a.
                                    default)(e)) ? we.extend({},
                                    e) : {
                                    complete: n || !n && t || we.isFunction(e) && e,
                                    duration: e,
                                    easing: n && t || t && !we.isFunction(t) && t
                                };
                                return we.fx.off ? r.duration = 0 : "number" != typeof r.duration && (r.duration in we.fx.speeds ? r.duration = we.fx.speeds[r.duration] : r.duration = we.fx.speeds._default),
                                null != r.queue && !0 !== r.queue || (r.queue = "fx"),
                                    r.old = r.complete,
                                    r.complete = function() {
                                        we.isFunction(r.old) && r.old.call(this),
                                        r.queue && we.dequeue(this, r.queue)
                                    },
                                    r
                            },
                            we.fn.extend({
                                fadeTo: function(e, t, n, r) {
                                    return this.filter(Ge).css("opacity", 0).show().end().animate({
                                            opacity: t
                                        },
                                        e, n, r)
                                },
                                animate: function(e, t, n, r) {
                                    var i = we.isEmptyObject(e),
                                        o = we.speed(t, n, r),
                                        a = function() {
                                            var t = J(this, we.extend({},
                                                e), o); (i || Be.get(this, "finish")) && t.stop(!0)
                                        };
                                    return a.finish = a,
                                        i || !1 === o.queue ? this.each(a) : this.queue(o.queue, a)
                                },
                                stop: function(e, t, n) {
                                    var r = function(e) {
                                        var t = e.stop;
                                        delete e.stop,
                                            t(n)
                                    };
                                    return "string" != typeof e && (n = t, t = e, e = void 0),
                                    t && !1 !== e && this.queue(e || "fx", []),
                                        this.each(function() {
                                            var t = !0,
                                                i = null != e && e + "queueHooks",
                                                o = we.timers,
                                                a = Be.get(this);
                                            if (i) a[i] && a[i].stop && r(a[i]);
                                            else for (i in a) a[i] && a[i].stop && kt.test(i) && r(a[i]);
                                            for (i = o.length; i--;) o[i].elem !== this || null != e && o[i].queue !== e || (o[i].anim.stop(n), t = !1, o.splice(i, 1)); ! t && n || we.dequeue(this, e)
                                        })
                                },
                                finish: function(e) {
                                    return ! 1 !== e && (e = e || "fx"),
                                        this.each(function() {
                                            var t, n = Be.get(this),
                                                r = n[e + "queue"],
                                                i = n[e + "queueHooks"],
                                                o = we.timers,
                                                a = r ? r.length: 0;
                                            for (n.finish = !0, we.queue(this, e, []), i && i.stop && i.stop.call(this, !0), t = o.length; t--;) o[t].elem === this && o[t].queue === e && (o[t].anim.stop(!0), o.splice(t, 1));
                                            for (t = 0; t < a; t++) r[t] && r[t].finish && r[t].finish.call(this);
                                            delete n.finish
                                        })
                                }
                            }),
                            we.each(["toggle", "show", "hide"],
                                function(e, t) {
                                    var n = we.fn[t];
                                    we.fn[t] = function(e, r, i) {
                                        return null == e || "boolean" == typeof e ? n.apply(this, arguments) : this.animate(G(t, !0), e, r, i)
                                    }
                                }),
                            we.each({
                                    slideDown: G("show"),
                                    slideUp: G("hide"),
                                    slideToggle: G("toggle"),
                                    fadeIn: {
                                        opacity: "show"
                                    },
                                    fadeOut: {
                                        opacity: "hide"
                                    },
                                    fadeToggle: {
                                        opacity: "toggle"
                                    }
                                },
                                function(e, t) {
                                    we.fn[e] = function(e, n, r) {
                                        return this.animate(t, e, n, r)
                                    }
                                }),
                            we.timers = [],
                            we.fx.tick = function() {
                                var e, t = 0,
                                    n = we.timers;
                                for (bt = we.now(); t < n.length; t++)(e = n[t])() || n[t] !== e || n.splice(t--, 1);
                                n.length || we.fx.stop(),
                                    bt = void 0
                            },
                            we.fx.timer = function(e) {
                                we.timers.push(e),
                                    we.fx.start()
                            },
                            we.fx.interval = 13,
                            we.fx.start = function() {
                                wt || (wt = !0, $())
                            },
                            we.fx.stop = function() {
                                wt = null
                            },
                            we.fx.speeds = {
                                slow: 600,
                                fast: 200,
                                _default: 400
                            },
                            we.fn.delay = function(e, t) {
                                return e = we.fx ? we.fx.speeds[e] || e: e,
                                    t = t || "fx",
                                    this.queue(t,
                                        function(t, n) {
                                            var r = o.setTimeout(t, e);
                                            n.stop = function() {
                                                o.clearTimeout(r)
                                            }
                                        })
                            },
                            function() {
                                var e = ce.createElement("input"),
                                    t = ce.createElement("select"),
                                    n = t.appendChild(ce.createElement("option"));
                                e.type = "checkbox",
                                    xe.checkOn = "" !== e.value,
                                    xe.optSelected = n.selected,
                                    e = ce.createElement("input"),
                                    e.value = "t",
                                    e.type = "radio",
                                    xe.radioValue = "t" === e.value
                            } ();
                        var Tt, Ct = we.expr.attrHandle;
                        we.fn.extend({
                            attr: function(e, t) {
                                return He(this, we.attr, e, t, arguments.length > 1)
                            },
                            removeAttr: function(e) {
                                return this.each(function() {
                                    we.removeAttr(this, e)
                                })
                            }
                        }),
                            we.extend({
                                attr: function(e, t, n) {
                                    var r, i, o = e.nodeType;
                                    if (3 !== o && 8 !== o && 2 !== o) return void 0 === e.getAttribute ? we.prop(e, t, n) : (1 === o && we.isXMLDoc(e) || (i = we.attrHooks[t.toLowerCase()] || (we.expr.match.bool.test(t) ? Tt: void 0)), void 0 !== n ? null === n ? void we.removeAttr(e, t) : i && "set" in i && void 0 !== (r = i.set(e, n, t)) ? r: (e.setAttribute(t, n + ""), n) : i && "get" in i && null !== (r = i.get(e, t)) ? r: (r = we.find.attr(e, t), null == r ? void 0 : r))
                                },
                                attrHooks: {
                                    type: {
                                        set: function(e, t) {
                                            if (!xe.radioValue && "radio" === t && l(e, "input")) {
                                                var n = e.value;
                                                return e.setAttribute("type", t),
                                                n && (e.value = n),
                                                    t
                                            }
                                        }
                                    }
                                },
                                removeAttr: function(e, t) {
                                    var n, r = 0,
                                        i = t && t.match(Me);
                                    if (i && 1 === e.nodeType) for (; n = i[r++];) e.removeAttribute(n)
                                }
                            }),
                            Tt = {
                                set: function(e, t, n) {
                                    return ! 1 === t ? we.removeAttr(e, n) : e.setAttribute(n, n),
                                        n
                                }
                            },
                            we.each(we.expr.match.bool.source.match(/\w+/g),
                                function(e, t) {
                                    var n = Ct[t] || we.find.attr;
                                    Ct[t] = function(e, t, r) {
                                        var i, o, a = t.toLowerCase();
                                        return r || (o = Ct[a], Ct[a] = i, i = null != n(e, t, r) ? a: null, Ct[a] = o),
                                            i
                                    }
                                });
                        var St = /^(?:input|select|textarea|button)$/i,
                            At = /^(?:a|area)$/i;
                        we.fn.extend({
                            prop: function(e, t) {
                                return He(this, we.prop, e, t, arguments.length > 1)
                            },
                            removeProp: function(e) {
                                return this.each(function() {
                                    delete this[we.propFix[e] || e]
                                })
                            }
                        }),
                            we.extend({
                                prop: function(e, t, n) {
                                    var r, i, o = e.nodeType;
                                    if (3 !== o && 8 !== o && 2 !== o) return 1 === o && we.isXMLDoc(e) || (t = we.propFix[t] || t, i = we.propHooks[t]),
                                        void 0 !== n ? i && "set" in i && void 0 !== (r = i.set(e, n, t)) ? r: e[t] = n: i && "get" in i && null !== (r = i.get(e, t)) ? r: e[t]
                                },
                                propHooks: {
                                    tabIndex: {
                                        get: function(e) {
                                            var t = we.find.attr(e, "tabindex");
                                            return t ? parseInt(t, 10) : St.test(e.nodeName) || At.test(e.nodeName) && e.href ? 0 : -1
                                        }
                                    }
                                },
                                propFix: {
                                    for: "htmlFor",
                                    class: "className"
                                }
                            }),
                        xe.optSelected || (we.propHooks.selected = {
                            get: function(e) {
                                var t = e.parentNode;
                                return t && t.parentNode && t.parentNode.selectedIndex,
                                    null
                            },
                            set: function(e) {
                                var t = e.parentNode;
                                t && (t.selectedIndex, t.parentNode && t.parentNode.selectedIndex)
                            }
                        }),
                            we.each(["tabIndex", "readOnly", "maxLength", "cellSpacing", "cellPadding", "rowSpan", "colSpan", "useMap", "frameBorder", "contentEditable"],
                                function() {
                                    we.propFix[this.toLowerCase()] = this
                                }),
                            we.fn.extend({
                                addClass: function(e) {
                                    var t, n, r, i, o, a, s, c = 0;
                                    if (we.isFunction(e)) return this.each(function(t) {
                                        we(this).addClass(e.call(this, t, ee(this)))
                                    });
                                    if ("string" == typeof e && e) for (t = e.match(Me) || []; n = this[c++];) if (i = ee(n), r = 1 === n.nodeType && " " + Z(i) + " ") {
                                        for (a = 0; o = t[a++];) r.indexOf(" " + o + " ") < 0 && (r += o + " ");
                                        s = Z(r),
                                        i !== s && n.setAttribute("class", s)
                                    }
                                    return this
                                },
                                removeClass: function(e) {
                                    var t, n, r, i, o, a, s, c = 0;
                                    if (we.isFunction(e)) return this.each(function(t) {
                                        we(this).removeClass(e.call(this, t, ee(this)))
                                    });
                                    if (!arguments.length) return this.attr("class", "");
                                    if ("string" == typeof e && e) for (t = e.match(Me) || []; n = this[c++];) if (i = ee(n), r = 1 === n.nodeType && " " + Z(i) + " ") {
                                        for (a = 0; o = t[a++];) for (; r.indexOf(" " + o + " ") > -1;) r = r.replace(" " + o + " ", " ");
                                        s = Z(r),
                                        i !== s && n.setAttribute("class", s)
                                    }
                                    return this
                                },
                                toggleClass: function(e, t) {
                                    var n = void 0 === e ? "undefined": (0, a.
                                        default)(e);
                                    return "boolean" == typeof t && "string" === n ? t ? this.addClass(e) : this.removeClass(e) : we.isFunction(e) ? this.each(function(n) {
                                        we(this).toggleClass(e.call(this, n, ee(this), t), t)
                                    }) : this.each(function() {
                                        var t, r, i, o;
                                        if ("string" === n) for (r = 0, i = we(this), o = e.match(Me) || []; t = o[r++];) i.hasClass(t) ? i.removeClass(t) : i.addClass(t);
                                        else void 0 !== e && "boolean" !== n || (t = ee(this), t && Be.set(this, "__className__", t), this.setAttribute && this.setAttribute("class", t || !1 === e ? "": Be.get(this, "__className__") || ""))
                                    })
                                },
                                hasClass: function(e) {
                                    var t, n, r = 0;
                                    for (t = " " + e + " "; n = this[r++];) if (1 === n.nodeType && (" " + Z(ee(n)) + " ").indexOf(t) > -1) return ! 0;
                                    return ! 1
                                }
                            });
                        var Et = /\r/g;
                        we.fn.extend({
                            val: function(e) {
                                var t, n, r, i = this[0];
                                return arguments.length ? (r = we.isFunction(e), this.each(function(n) {
                                    var i;
                                    1 === this.nodeType && (i = r ? e.call(this, n, we(this).val()) : e, null == i ? i = "": "number" == typeof i ? i += "": Array.isArray(i) && (i = we.map(i,
                                        function(e) {
                                            return null == e ? "": e + ""
                                        })), (t = we.valHooks[this.type] || we.valHooks[this.nodeName.toLowerCase()]) && "set" in t && void 0 !== t.set(this, i, "value") || (this.value = i))
                                })) : i ? (t = we.valHooks[i.type] || we.valHooks[i.nodeName.toLowerCase()], t && "get" in t && void 0 !== (n = t.get(i, "value")) ? n: (n = i.value, "string" == typeof n ? n.replace(Et, "") : null == n ? "": n)) : void 0
                            }
                        }),
                            we.extend({
                                valHooks: {
                                    option: {
                                        get: function(e) {
                                            var t = we.find.attr(e, "value");
                                            return null != t ? t: Z(we.text(e))
                                        }
                                    },
                                    select: {
                                        get: function(e) {
                                            var t, n, r, i = e.options,
                                                o = e.selectedIndex,
                                                a = "select-one" === e.type,
                                                s = a ? null: [],
                                                c = a ? o + 1 : i.length;
                                            for (r = o < 0 ? c: a ? o: 0; r < c; r++) if (n = i[r], (n.selected || r === o) && !n.disabled && (!n.parentNode.disabled || !l(n.parentNode, "optgroup"))) {
                                                if (t = we(n).val(), a) return t;
                                                s.push(t)
                                            }
                                            return s
                                        },
                                        set: function(e, t) {
                                            for (var n, r, i = e.options,
                                                     o = we.makeArray(t), a = i.length; a--;) r = i[a],
                                            (r.selected = we.inArray(we.valHooks.option.get(r), o) > -1) && (n = !0);
                                            return n || (e.selectedIndex = -1),
                                                o
                                        }
                                    }
                                }
                            }),
                            we.each(["radio", "checkbox"],
                                function() {
                                    we.valHooks[this] = {
                                        set: function(e, t) {
                                            if (Array.isArray(t)) return e.checked = we.inArray(we(e).val(), t) > -1
                                        }
                                    },
                                    xe.checkOn || (we.valHooks[this].get = function(e) {
                                        return null === e.getAttribute("value") ? "on": e.value
                                    })
                                });
                        var jt = /^(?:focusinfocus|focusoutblur)$/;
                        we.extend(we.event, {
                            trigger: function(e, t, n, r) {
                                var i, s, c, u, l, f, p, d = [n || ce],
                                    h = ve.call(e, "type") ? e.type: e,
                                    g = ve.call(e, "namespace") ? e.namespace.split(".") : [];
                                if (s = c = n = n || ce, 3 !== n.nodeType && 8 !== n.nodeType && !jt.test(h + we.event.triggered) && (h.indexOf(".") > -1 && (g = h.split("."), h = g.shift(), g.sort()), l = h.indexOf(":") < 0 && "on" + h, e = e[we.expando] ? e: new we.Event(h, "object" == (void 0 === e ? "undefined": (0, a.
                                        default)(e)) && e), e.isTrigger = r ? 2 : 3, e.namespace = g.join("."), e.rnamespace = e.namespace ? new RegExp("(^|\\.)" + g.join("\\.(?:.*\\.|)") + "(\\.|$)") : null, e.result = void 0, e.target || (e.target = n), t = null == t ? [e] : we.makeArray(t, [e]), p = we.event.special[h] || {},
                                    r || !p.trigger || !1 !== p.trigger.apply(n, t))) {
                                    if (!r && !p.noBubble && !we.isWindow(n)) {
                                        for (u = p.delegateType || h, jt.test(u + h) || (s = s.parentNode); s; s = s.parentNode) d.push(s),
                                            c = s;
                                        c === (n.ownerDocument || ce) && d.push(c.defaultView || c.parentWindow || o)
                                    }
                                    for (i = 0; (s = d[i++]) && !e.isPropagationStopped();) e.type = i > 1 ? u: p.bindType || h,
                                        f = (Be.get(s, "events") || {})[e.type] && Be.get(s, "handle"),
                                    f && f.apply(s, t),
                                    (f = l && s[l]) && f.apply && Ie(s) && (e.result = f.apply(s, t), !1 === e.result && e.preventDefault());
                                    return e.type = h,
                                    r || e.isDefaultPrevented() || p._default && !1 !== p._default.apply(d.pop(), t) || !Ie(n) || l && we.isFunction(n[h]) && !we.isWindow(n) && (c = n[l], c && (n[l] = null), we.event.triggered = h, n[h](), we.event.triggered = void 0, c && (n[l] = c)),
                                        e.result
                                }
                            },
                            simulate: function(e, t, n) {
                                var r = we.extend(new we.Event, n, {
                                    type: e,
                                    isSimulated: !0
                                });
                                we.event.trigger(r, null, t)
                            }
                        }),
                            we.fn.extend({
                                trigger: function(e, t) {
                                    return this.each(function() {
                                        we.event.trigger(e, t, this)
                                    })
                                },
                                triggerHandler: function(e, t) {
                                    var n = this[0];
                                    if (n) return we.event.trigger(e, t, n, !0)
                                }
                            }),
                            we.each("blur focus focusin focusout resize scroll click dblclick mousedown mouseup mousemove mouseover mouseout mouseenter mouseleave change select submit keydown keypress keyup contextmenu".split(" "),
                                function(e, t) {
                                    we.fn[t] = function(e, n) {
                                        return arguments.length > 0 ? this.on(t, null, e, n) : this.trigger(t)
                                    }
                                }),
                            we.fn.extend({
                                hover: function(e, t) {
                                    return this.mouseenter(e).mouseleave(t || e)
                                }
                            }),
                            xe.focusin = "onfocusin" in o,
                        xe.focusin || we.each({
                                focus: "focusin",
                                blur: "focusout"
                            },
                            function(e, t) {
                                var n = function(e) {
                                    we.event.simulate(t, e.target, we.event.fix(e))
                                };
                                we.event.special[t] = {
                                    setup: function() {
                                        var r = this.ownerDocument || this,
                                            i = Be.access(r, t);
                                        i || r.addEventListener(e, n, !0),
                                            Be.access(r, t, (i || 0) + 1)
                                    },
                                    teardown: function() {
                                        var r = this.ownerDocument || this,
                                            i = Be.access(r, t) - 1;
                                        i ? Be.access(r, t, i) : (r.removeEventListener(e, n, !0), Be.remove(r, t))
                                    }
                                }
                            });
                        var Nt = o.location,
                            Dt = we.now(),
                            Lt = /\?/;
                        we.parseXML = function(e) {
                            var t;
                            if (!e || "string" != typeof e) return null;
                            try {
                                t = (new o.DOMParser).parseFromString(e, "text/xml")
                            } catch(e) {
                                t = void 0
                            }
                            return t && !t.getElementsByTagName("parsererror").length || we.error("Invalid XML: " + e),
                                t
                        };
                        var Ot = /\[\]$/,
                            Pt = /\r?\n/g,
                            Ft = /^(?:submit|button|image|reset|file)$/i,
                            Mt = /^(?:input|select|textarea|keygen)/i;
                        we.param = function(e, t) {
                            var n, r = [],
                                i = function(e, t) {
                                    var n = we.isFunction(t) ? t() : t;
                                    r[r.length] = encodeURIComponent(e) + "=" + encodeURIComponent(null == n ? "": n)
                                };
                            if (Array.isArray(e) || e.jquery && !we.isPlainObject(e)) we.each(e,
                                function() {
                                    i(this.name, this.value)
                                });
                            else for (n in e) te(n, e[n], t, i);
                            return r.join("&")
                        },
                            we.fn.extend({
                                serialize: function() {
                                    return we.param(this.serializeArray())
                                },
                                serializeArray: function() {
                                    return this.map(function() {
                                        var e = we.prop(this, "elements");
                                        return e ? we.makeArray(e) : this
                                    }).filter(function() {
                                        var e = this.type;
                                        return this.name && !we(this).is(":disabled") && Mt.test(this.nodeName) && !Ft.test(e) && (this.checked || !Qe.test(e))
                                    }).map(function(e, t) {
                                        var n = we(this).val();
                                        return null == n ? null: Array.isArray(n) ? we.map(n,
                                            function(e) {
                                                return {
                                                    name: t.name,
                                                    value: e.replace(Pt, "\r\n")
                                                }
                                            }) : {
                                            name: t.name,
                                            value: n.replace(Pt, "\r\n")
                                        }
                                    }).get()
                                }
                            });
                        var Rt = /%20/g,
                            qt = /#.*$/,
                            Ht = /([?&])_=[^&]*/,
                            It = /^(.*?):[ \t]*([^\r\n]*)$/gm,
                            Bt = /^(?:about|app|app-storage|.+-extension|file|res|widget):$/,
                            Wt = /^(?:GET|HEAD)$/,
                            Ut = /^\/\//,
                            zt = {},
                            Kt = {},
                            $t = "*/".concat("*"),
                            Vt = ce.createElement("a");
                        Vt.href = Nt.href,
                            we.extend({
                                active: 0,
                                lastModified: {},
                                etag: {},
                                ajaxSettings: {
                                    url: Nt.href,
                                    type: "GET",
                                    isLocal: Bt.test(Nt.protocol),
                                    global: !0,
                                    processData: !0,
                                    async: !0,
                                    contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                                    accepts: {
                                        "*": $t,
                                        text: "text/plain",
                                        html: "text/html",
                                        xml: "application/xml, text/xml",
                                        json: "application/json, text/javascript"
                                    },
                                    contents: {
                                        xml: /\bxml\b/,
                                        html: /\bhtml/,
                                        json: /\bjson\b/
                                    },
                                    responseFields: {
                                        xml: "responseXML",
                                        text: "responseText",
                                        json: "responseJSON"
                                    },
                                    converters: {
                                        "* text": String,
                                        "text html": !0,
                                        "text json": JSON.parse,
                                        "text xml": we.parseXML
                                    },
                                    flatOptions: {
                                        url: !0,
                                        context: !0
                                    }
                                },
                                ajaxSetup: function(e, t) {
                                    return t ? ie(ie(e, we.ajaxSettings), t) : ie(we.ajaxSettings, e)
                                },
                                ajaxPrefilter: ne(zt),
                                ajaxTransport: ne(Kt),
                                ajax: function(e, t) {
                                    function n(e, t, n, a) {
                                        var c, l, d, h, w, _ = t;
                                        f || (f = !0, u && o.clearTimeout(u), r = void 0, s = a || "", T.readyState = e > 0 ? 4 : 0, c = e >= 200 && e < 300 || 304 === e, n && (h = oe(g, T, n)), h = ae(g, h, T, c), c ? (g.ifModified && (w = T.getResponseHeader("Last-Modified"), w && (we.lastModified[i] = w), (w = T.getResponseHeader("etag")) && (we.etag[i] = w)), 204 === e || "HEAD" === g.type ? _ = "nocontent": 304 === e ? _ = "notmodified": (_ = h.state, l = h.data, d = h.error, c = !d)) : (d = _, !e && _ || (_ = "error", e < 0 && (e = 0))), T.status = e, T.statusText = (t || _) + "", c ? m.resolveWith(v, [l, _, T]) : m.rejectWith(v, [T, _, d]), T.statusCode(b), b = void 0, p && y.trigger(c ? "ajaxSuccess": "ajaxError", [T, g, c ? l: d]), x.fireWith(v, [T, _]), p && (y.trigger("ajaxComplete", [T, g]), --we.active || we.event.trigger("ajaxStop")))
                                    }
                                    "object" == (void 0 === e ? "undefined": (0, a.
                                        default)(e)) && (t = e, e = void 0),
                                        t = t || {};
                                    var r, i, s, c, u, l, f, p, d, h, g = we.ajaxSetup({},
                                        t),
                                        v = g.context || g,
                                        y = g.context && (v.nodeType || v.jquery) ? we(v) : we.event,
                                        m = we.Deferred(),
                                        x = we.Callbacks("once memory"),
                                        b = g.statusCode || {},
                                        w = {},
                                        _ = {},
                                        k = "canceled",
                                        T = {
                                            readyState: 0,
                                            getResponseHeader: function(e) {
                                                var t;
                                                if (f) {
                                                    if (!c) for (c = {}; t = It.exec(s);) c[t[1].toLowerCase()] = t[2];
                                                    t = c[e.toLowerCase()]
                                                }
                                                return null == t ? null: t
                                            },
                                            getAllResponseHeaders: function() {
                                                return f ? s: null
                                            },
                                            setRequestHeader: function(e, t) {
                                                return null == f && (e = _[e.toLowerCase()] = _[e.toLowerCase()] || e, w[e] = t),
                                                    this
                                            },
                                            overrideMimeType: function(e) {
                                                return null == f && (g.mimeType = e),
                                                    this
                                            },
                                            statusCode: function(e) {
                                                var t;
                                                if (e) if (f) T.always(e[T.status]);
                                                else for (t in e) b[t] = [b[t], e[t]];
                                                return this
                                            },
                                            abort: function(e) {
                                                var t = e || k;
                                                return r && r.abort(t),
                                                    n(0, t),
                                                    this
                                            }
                                        };
                                    if (m.promise(T), g.url = ((e || g.url || Nt.href) + "").replace(Ut, Nt.protocol + "//"), g.type = t.method || t.type || g.method || g.type, g.dataTypes = (g.dataType || "*").toLowerCase().match(Me) || [""], null == g.crossDomain) {
                                        l = ce.createElement("a");
                                        try {
                                            l.href = g.url,
                                                l.href = l.href,
                                                g.crossDomain = Vt.protocol + "//" + Vt.host != l.protocol + "//" + l.host
                                        } catch(e) {
                                            g.crossDomain = !0
                                        }
                                    }
                                    if (g.data && g.processData && "string" != typeof g.data && (g.data = we.param(g.data, g.traditional)), re(zt, g, t, T), f) return T;
                                    p = we.event && g.global,
                                    p && 0 == we.active++&&we.event.trigger("ajaxStart"),
                                        g.type = g.type.toUpperCase(),
                                        g.hasContent = !Wt.test(g.type),
                                        i = g.url.replace(qt, ""),
                                        g.hasContent ? g.data && g.processData && 0 === (g.contentType || "").indexOf("application/x-www-form-urlencoded") && (g.data = g.data.replace(Rt, "+")) : (h = g.url.slice(i.length), g.data && (i += (Lt.test(i) ? "&": "?") + g.data, delete g.data), !1 === g.cache && (i = i.replace(Ht, "$1"), h = (Lt.test(i) ? "&": "?") + "_=" + Dt+++h), g.url = i + h),
                                    g.ifModified && (we.lastModified[i] && T.setRequestHeader("If-Modified-Since", we.lastModified[i]), we.etag[i] && T.setRequestHeader("If-None-Match", we.etag[i])),
                                    (g.data && g.hasContent && !1 !== g.contentType || t.contentType) && T.setRequestHeader("Content-Type", g.contentType),
                                        T.setRequestHeader("Accept", g.dataTypes[0] && g.accepts[g.dataTypes[0]] ? g.accepts[g.dataTypes[0]] + ("*" !== g.dataTypes[0] ? ", " + $t + "; q=0.01": "") : g.accepts["*"]);
                                    for (d in g.headers) T.setRequestHeader(d, g.headers[d]);
                                    if (g.beforeSend && (!1 === g.beforeSend.call(v, T, g) || f)) return T.abort();
                                    if (k = "abort", x.add(g.complete), T.done(g.success), T.fail(g.error), r = re(Kt, g, t, T)) {
                                        if (T.readyState = 1, p && y.trigger("ajaxSend", [T, g]), f) return T;
                                        g.async && g.timeout > 0 && (u = o.setTimeout(function() {
                                                T.abort("timeout")
                                            },
                                            g.timeout));
                                        try {
                                            f = !1,
                                                r.send(w, n)
                                        } catch(e) {
                                            if (f) throw e;
                                            n( - 1, e)
                                        }
                                    } else n( - 1, "No Transport");
                                    return T
                                },
                                getJSON: function(e, t, n) {
                                    return we.get(e, t, n, "json")
                                },
                                getScript: function(e, t) {
                                    return we.get(e, void 0, t, "script")
                                }
                            }),
                            we.each(["get", "post"],
                                function(e, t) {
                                    we[t] = function(e, n, r, i) {
                                        return we.isFunction(n) && (i = i || r, r = n, n = void 0),
                                            we.ajax(we.extend({
                                                    url: e,
                                                    type: t,
                                                    dataType: i,
                                                    data: n,
                                                    success: r
                                                },
                                                we.isPlainObject(e) && e))
                                    }
                                }),
                            we._evalUrl = function(e) {
                                return we.ajax({
                                    url: e,
                                    type: "GET",
                                    dataType: "script",
                                    cache: !0,
                                    async: !1,
                                    global: !1,
                                    throws: !0
                                })
                            },
                            we.fn.extend({
                                wrapAll: function(e) {
                                    var t;
                                    return this[0] && (we.isFunction(e) && (e = e.call(this[0])), t = we(e, this[0].ownerDocument).eq(0).clone(!0), this[0].parentNode && t.insertBefore(this[0]), t.map(function() {
                                        for (var e = this; e.firstElementChild;) e = e.firstElementChild;
                                        return e
                                    }).append(this)),
                                        this
                                },
                                wrapInner: function(e) {
                                    return we.isFunction(e) ? this.each(function(t) {
                                        we(this).wrapInner(e.call(this, t))
                                    }) : this.each(function() {
                                        var t = we(this),
                                            n = t.contents();
                                        n.length ? n.wrapAll(e) : t.append(e)
                                    })
                                },
                                wrap: function(e) {
                                    var t = we.isFunction(e);
                                    return this.each(function(n) {
                                        we(this).wrapAll(t ? e.call(this, n) : e)
                                    })
                                },
                                unwrap: function(e) {
                                    return this.parent(e).not("body").each(function() {
                                        we(this).replaceWith(this.childNodes)
                                    }),
                                        this
                                }
                            }),
                            we.expr.pseudos.hidden = function(e) {
                                return ! we.expr.pseudos.visible(e)
                            },
                            we.expr.pseudos.visible = function(e) {
                                return !! (e.offsetWidth || e.offsetHeight || e.getClientRects().length)
                            },
                            we.ajaxSettings.xhr = function() {
                                try {
                                    return new o.XMLHttpRequest
                                } catch(e) {}
                            };
                        var Gt = {
                                0 : 200,
                                1223 : 204
                            },
                            Yt = we.ajaxSettings.xhr();
                        xe.cors = !!Yt && "withCredentials" in Yt,
                            xe.ajax = Yt = !!Yt,
                            we.ajaxTransport(function(e) {
                                var t, n;
                                if (xe.cors || Yt && !e.crossDomain) return {
                                    send: function(r, i) {
                                        var a, s = e.xhr();
                                        if (s.open(e.type, e.url, e.async, e.username, e.password), e.xhrFields) for (a in e.xhrFields) s[a] = e.xhrFields[a];
                                        e.mimeType && s.overrideMimeType && s.overrideMimeType(e.mimeType),
                                        e.crossDomain || r["X-Requested-With"] || (r["X-Requested-With"] = "XMLHttpRequest");
                                        for (a in r) s.setRequestHeader(a, r[a]);
                                        t = function(e) {
                                            return function() {
                                                t && (t = n = s.onload = s.onerror = s.onabort = s.onreadystatechange = null, "abort" === e ? s.abort() : "error" === e ? "number" != typeof s.status ? i(0, "error") : i(s.status, s.statusText) : i(Gt[s.status] || s.status, s.statusText, "text" !== (s.responseType || "text") || "string" != typeof s.responseText ? {
                                                        binary: s.response
                                                    }: {
                                                        text: s.responseText
                                                    },
                                                    s.getAllResponseHeaders()))
                                            }
                                        },
                                            s.onload = t(),
                                            n = s.onerror = t("error"),
                                            void 0 !== s.onabort ? s.onabort = n: s.onreadystatechange = function() {
                                                4 === s.readyState && o.setTimeout(function() {
                                                    t && n()
                                                })
                                            },
                                            t = t("abort");
                                        try {
                                            s.send(e.hasContent && e.data || null)
                                        } catch(e) {
                                            if (t) throw e
                                        }
                                    },
                                    abort: function() {
                                        t && t()
                                    }
                                }
                            }),
                            we.ajaxPrefilter(function(e) {
                                e.crossDomain && (e.contents.script = !1)
                            }),
                            we.ajaxSetup({
                                accepts: {
                                    script: "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript"
                                },
                                contents: {
                                    script: /\b(?:java|ecma)script\b/
                                },
                                converters: {
                                    "text script": function(e) {
                                        return we.globalEval(e),
                                            e
                                    }
                                }
                            }),
                            we.ajaxPrefilter("script",
                                function(e) {
                                    void 0 === e.cache && (e.cache = !1),
                                    e.crossDomain && (e.type = "GET")
                                }),
                            we.ajaxTransport("script",
                                function(e) {
                                    if (e.crossDomain) {
                                        var t, n;
                                        return {
                                            send: function(r, i) {
                                                t = we("<script>").prop({
                                                    charset: e.scriptCharset,
                                                    src: e.url
                                                }).on("load error", n = function(e) {
                                                    t.remove(),
                                                        n = null,
                                                    e && i("error" === e.type ? 404 : 200, e.type)
                                                }),
                                                    ce.head.appendChild(t[0])
                                            },
                                            abort: function() {
                                                n && n()
                                            }
                                        }
                                    }
                                });
                        var Xt = [],
                            Qt = /(=)\?(?=&|$)|\?\?/;
                        we.ajaxSetup({
                            jsonp: "callback",
                            jsonpCallback: function() {
                                var e = Xt.pop() || we.expando + "_" + Dt++;
                                return this[e] = !0,
                                    e
                            }
                        }),
                            we.ajaxPrefilter("json jsonp",
                                function(e, t, n) {
                                    var r, i, a, s = !1 !== e.jsonp && (Qt.test(e.url) ? "url": "string" == typeof e.data && 0 === (e.contentType || "").indexOf("application/x-www-form-urlencoded") && Qt.test(e.data) && "data");
                                    if (s || "jsonp" === e.dataTypes[0]) return r = e.jsonpCallback = we.isFunction(e.jsonpCallback) ? e.jsonpCallback() : e.jsonpCallback,
                                        s ? e[s] = e[s].replace(Qt, "$1" + r) : !1 !== e.jsonp && (e.url += (Lt.test(e.url) ? "&": "?") + e.jsonp + "=" + r),
                                        e.converters["script json"] = function() {
                                            return a || we.error(r + " was not called"),
                                                a[0]
                                        },
                                        e.dataTypes[0] = "json",
                                        i = o[r],
                                        o[r] = function() {
                                            a = arguments
                                        },
                                        n.always(function() {
                                            void 0 === i ? we(o).removeProp(r) : o[r] = i,
                                            e[r] && (e.jsonpCallback = t.jsonpCallback, Xt.push(r)),
                                            a && we.isFunction(i) && i(a[0]),
                                                a = i = void 0
                                        }),
                                        "script"
                                }),
                            xe.createHTMLDocument = function() {
                                var e = ce.implementation.createHTMLDocument("").body;
                                return e.innerHTML = "<form></form><form></form>",
                                2 === e.childNodes.length
                            } (),
                            we.parseHTML = function(e, t, n) {
                                if ("string" != typeof e) return [];
                                "boolean" == typeof t && (n = t, t = !1);
                                var r, i, o;
                                return t || (xe.createHTMLDocument ? (t = ce.implementation.createHTMLDocument(""), r = t.createElement("base"), r.href = ce.location.href, t.head.appendChild(r)) : t = ce),
                                    i = Ne.exec(e),
                                    o = !n && [],
                                    i ? [t.createElement(i[1])] : (i = S([e], t, o), o && o.length && we(o).remove(), we.merge([], i.childNodes))
                            },
                            we.fn.load = function(e, t, n) {
                                var r, i, o, s = this,
                                    c = e.indexOf(" ");
                                return c > -1 && (r = Z(e.slice(c)), e = e.slice(0, c)),
                                    we.isFunction(t) ? (n = t, t = void 0) : t && "object" == (void 0 === t ? "undefined": (0, a.
                                        default)(t)) && (i = "POST"),
                                s.length > 0 && we.ajax({
                                    url: e,
                                    type: i || "GET",
                                    dataType: "html",
                                    data: t
                                }).done(function(e) {
                                    o = arguments,
                                        s.html(r ? we("<div>").append(we.parseHTML(e)).find(r) : e)
                                }).always(n &&
                                    function(e, t) {
                                        s.each(function() {
                                            n.apply(this, o || [e.responseText, t, e])
                                        })
                                    }),
                                    this
                            },
                            we.each(["ajaxStart", "ajaxStop", "ajaxComplete", "ajaxError", "ajaxSuccess", "ajaxSend"],
                                function(e, t) {
                                    we.fn[t] = function(e) {
                                        return this.on(t, e)
                                    }
                                }),
                            we.expr.pseudos.animated = function(e) {
                                return we.grep(we.timers,
                                    function(t) {
                                        return e === t.elem
                                    }).length
                            },
                            we.offset = {
                                setOffset: function(e, t, n) {
                                    var r, i, o, a, s, c, u, l = we.css(e, "position"),
                                        f = we(e),
                                        p = {};
                                    "static" === l && (e.style.position = "relative"),
                                        s = f.offset(),
                                        o = we.css(e, "top"),
                                        c = we.css(e, "left"),
                                        u = ("absolute" === l || "fixed" === l) && (o + c).indexOf("auto") > -1,
                                        u ? (r = f.position(), a = r.top, i = r.left) : (a = parseFloat(o) || 0, i = parseFloat(c) || 0),
                                    we.isFunction(t) && (t = t.call(e, n, we.extend({},
                                        s))),
                                    null != t.top && (p.top = t.top - s.top + a),
                                    null != t.left && (p.left = t.left - s.left + i),
                                        "using" in t ? t.using.call(e, p) : f.css(p)
                                }
                            },
                            we.fn.extend({
                                offset: function(e) {
                                    if (arguments.length) return void 0 === e ? this: this.each(function(t) {
                                        we.offset.setOffset(this, e, t)
                                    });
                                    var t, n, r, i, o = this[0];
                                    return o ? o.getClientRects().length ? (r = o.getBoundingClientRect(), t = o.ownerDocument, n = t.documentElement, i = t.defaultView, {
                                        top: r.top + i.pageYOffset - n.clientTop,
                                        left: r.left + i.pageXOffset - n.clientLeft
                                    }) : {
                                        top: 0,
                                        left: 0
                                    }: void 0
                                },
                                position: function() {
                                    if (this[0]) {
                                        var e, t, n = this[0],
                                            r = {
                                                top: 0,
                                                left: 0
                                            };
                                        return "fixed" === we.css(n, "position") ? t = n.getBoundingClientRect() : (e = this.offsetParent(), t = this.offset(), l(e[0], "html") || (r = e.offset()), r = {
                                            top: r.top + we.css(e[0], "borderTopWidth", !0),
                                            left: r.left + we.css(e[0], "borderLeftWidth", !0)
                                        }),
                                            {
                                                top: t.top - r.top - we.css(n, "marginTop", !0),
                                                left: t.left - r.left - we.css(n, "marginLeft", !0)
                                            }
                                    }
                                },
                                offsetParent: function() {
                                    return this.map(function() {
                                        for (var e = this.offsetParent; e && "static" === we.css(e, "position");) e = e.offsetParent;
                                        return e || nt
                                    })
                                }
                            }),
                            we.each({
                                    scrollLeft: "pageXOffset",
                                    scrollTop: "pageYOffset"
                                },
                                function(e, t) {
                                    var n = "pageYOffset" === t;
                                    we.fn[e] = function(r) {
                                        return He(this,
                                            function(e, r, i) {
                                                var o;
                                                return we.isWindow(e) ? o = e: 9 === e.nodeType && (o = e.defaultView),
                                                    void 0 === i ? o ? o[t] : e[r] : void(o ? o.scrollTo(n ? o.pageXOffset: i, n ? i: o.pageYOffset) : e[r] = i)
                                            },
                                            e, r, arguments.length)
                                    }
                                }),
                            we.each(["top", "left"],
                                function(e, t) {
                                    we.cssHooks[t] = H(xe.pixelPosition,
                                        function(e, n) {
                                            if (n) return n = q(e, t),
                                                pt.test(n) ? we(e).position()[t] + "px": n
                                        })
                                }),
                            we.each({
                                    Height: "height",
                                    Width: "width"
                                },
                                function(e, t) {
                                    we.each({
                                            padding: "inner" + e,
                                            content: t,
                                            "": "outer" + e
                                        },
                                        function(n, r) {
                                            we.fn[r] = function(i, o) {
                                                var a = arguments.length && (n || "boolean" != typeof i),
                                                    s = n || (!0 === i || !0 === o ? "margin": "border");
                                                return He(this,
                                                    function(t, n, i) {
                                                        var o;
                                                        return we.isWindow(t) ? 0 === r.indexOf("outer") ? t["inner" + e] : t.document.documentElement["client" + e] : 9 === t.nodeType ? (o = t.documentElement, Math.max(t.body["scroll" + e], o["scroll" + e], t.body["offset" + e], o["offset" + e], o["client" + e])) : void 0 === i ? we.css(t, n, s) : we.style(t, n, i, s)
                                                    },
                                                    t, a ? i: void 0, a)
                                            }
                                        })
                                }),
                            we.fn.extend({
                                bind: function(e, t, n) {
                                    return this.on(e, null, t, n)
                                },
                                unbind: function(e, t) {
                                    return this.off(e, null, t)
                                },
                                delegate: function(e, t, n, r) {
                                    return this.on(t, e, n, r)
                                },
                                undelegate: function(e, t, n) {
                                    return 1 === arguments.length ? this.off(e, "**") : this.off(t, e || "**", n)
                                }
                            }),
                            we.holdReady = function(e) {
                                e ? we.readyWait++:we.ready(!0)
                            },
                            we.isArray = Array.isArray,
                            we.parseJSON = JSON.parse,
                            we.nodeName = l,
                        n(71) && (r = [], void 0 !== (i = function() {
                            return we
                        }.apply(t, r)) && (e.exports = i));
                        var Jt = o.jQuery,
                            Zt = o.$;
                        return we.noConflict = function(e) {
                            return o.$ === we && (o.$ = Zt),
                            e && o.jQuery === we && (o.jQuery = Jt),
                                we
                        },
                        s || (o.jQuery = o.$ = we),
                            we
                    })
        }).call(t, n(39)(e))
    },
    function(e, t, n) {
        "use strict";
        var r = n(14),
            i = n(28),
            o = n(31),
            a = n(2),
            s = n(1),
            c = n(17),
            u = n(47),
            l = n(22),
            f = n(54),
            p = n(6)("iterator"),
            d = !([].keys && "next" in [].keys()),
            h = function() {
                return this
            };
        e.exports = function(e, t, n, g, v, y, m) {
            u(n, t, g);
            var x, b, w, _ = function(e) {
                    if (!d && e in S) return S[e];
                    switch (e) {
                        case "keys":
                        case "values":
                            return function() {
                                return new n(this, e)
                            }
                    }
                    return function() {
                        return new n(this, e)
                    }
                },
                k = t + " Iterator",
                T = "values" == v,
                C = !1,
                S = e.prototype,
                A = S[p] || S["@@iterator"] || v && S[v],
                E = !d && A || _(v),
                j = v ? T ? _("entries") : E: void 0,
                N = "Array" == t ? S.entries || A: A;
            if (N && (w = f(N.call(new e))) !== Object.prototype && w.next && (l(w, k, !0), r || s(w, p) || a(w, p, h)), T && A && "values" !== A.name && (C = !0, E = function() {
                    return A.call(this)
                }), r && !m || !d && !C && S[p] || a(S, p, E), c[t] = E, c[k] = h, v) if (x = {
                    values: T ? E: _("values"),
                    keys: y ? E: _("keys"),
                    entries: j
                },
                    m) for (b in x) b in S || o(S, b, x[b]);
            else i(i.P + i.F * (d || C), t, x);
            return x
        }
    },
    function(e, t, n) {
        var r = n(0),
            i = n(15),
            o = n(45),
            a = n(2),
            s = function(e, t, n) {
                var c, u, l, f = e & s.F,
                    p = e & s.G,
                    d = e & s.S,
                    h = e & s.P,
                    g = e & s.B,
                    v = e & s.W,
                    y = p ? i: i[t] || (i[t] = {}),
                    m = y.prototype,
                    x = p ? r: d ? r[t] : (r[t] || {}).prototype;
                p && (n = t);
                for (c in n)(u = !f && x && void 0 !== x[c]) && c in y || (l = u ? x[c] : n[c], y[c] = p && "function" != typeof x[c] ? n[c] : g && u ? o(l, r) : v && x[c] == l ?
                    function(e) {
                        var t = function(t, n, r) {
                            if (this instanceof e) {
                                switch (arguments.length) {
                                    case 0:
                                        return new e;
                                    case 1:
                                        return new e(t);
                                    case 2:
                                        return new e(t, n)
                                }
                                return new e(t, n, r)
                            }
                            return e.apply(this, arguments)
                        };
                        return t.prototype = e.prototype,
                            t
                    } (l) : h && "function" == typeof l ? o(Function.call, l) : l, h && ((y.virtual || (y.virtual = {}))[c] = l, e & s.R && m && !m[c] && a(m, c, l)))
            };
        s.F = 1,
            s.G = 2,
            s.S = 4,
            s.P = 8,
            s.B = 16,
            s.W = 32,
            s.U = 64,
            s.R = 128,
            e.exports = s
    },
    function(e, t, n) {
        e.exports = !n(4) && !n(9)(function() {
            return 7 != Object.defineProperty(n(30)("div"), "a", {
                get: function() {
                    return 7
                }
            }).a
        })
    },
    function(e, t, n) {
        var r = n(7),
            i = n(0).document,
            o = r(i) && r(i.createElement);
        e.exports = function(e) {
            return o ? i.createElement(e) : {}
        }
    },
    function(e, t, n) {
        e.exports = n(2)
    },
    function(e, t, n) {
        var r = n(8),
            i = n(48),
            o = n(21),
            a = n(19)("IE_PROTO"),
            s = function() {},
            c = function() {
                var e, t = n(30)("iframe"),
                    r = o.length;
                for (t.style.display = "none", n(53).appendChild(t), t.src = "javascript:", e = t.contentWindow.document, e.open(), e.write("<script>document.F=Object<\/script>"), e.close(), c = e.F; r--;) delete c.prototype[o[r]];
                return c()
            };
        e.exports = Object.create ||
            function(e, t) {
                var n;
                return null !== e ? (s.prototype = r(e), n = new s, s.prototype = null, n[a] = e) : n = c(),
                    void 0 === t ? n: i(n, t)
            }
    },
    function(e, t, n) {
        var r = n(1),
            i = n(5),
            o = n(50)(!1),
            a = n(19)("IE_PROTO");
        e.exports = function(e, t) {
            var n, s = i(e),
                c = 0,
                u = [];
            for (n in s) n != a && r(s, n) && u.push(n);
            for (; t.length > c;) r(s, n = t[c++]) && (~o(u, n) || u.push(n));
            return u
        }
    },
    function(e, t) {
        var n = {}.toString;
        e.exports = function(e) {
            return n.call(e).slice(8, -1)
        }
    },
    function(e, t) {
        t.f = Object.getOwnPropertySymbols
    },
    function(e, t, n) {
        var r = n(33),
            i = n(21).concat("length", "prototype");
        t.f = Object.getOwnPropertyNames ||
            function(e) {
                return r(e, i)
            }
    },
    function(e, t, n) {
        "use strict";
        function r(e) {
            return e = encodeURIComponent(e),
                e = e.replace(/(!)/g, "%21"),
                e = e.replace(/(')/g, "%27"),
                e = e.replace(/(\()/g, "%28"),
                e = e.replace(/(\))/g, "%29"),
                e = e.replace(/(\*)/g, "%2A"),
                e = e.replace(/(~)/g, "%7E")
        }
        var i = n(26),
            o = n(72),
            a = {};
        Number.prototype.toFixed = function(e) {
            var t, n, r = 0,
                i = this + "",
                o = i.indexOf(".");
            i.substr(o + e + 1, 1) >= 5 && -1 != o && (r = this > 0 ? 1 : -1);
            var n = Math.pow(10, e);
            t = this >= 0 ? Math.floor(this * n) + r: Math.ceil(this * n) + r;
            var a = t / n + ""; - 1 == a.indexOf(".") && 0 != e && (o = a.length, a += ".");
            return 0 != e &&
            function t() {
                e - (a.length - o - 1) > 0 && (a += "0", t())
            } (),
                a
        },
            a.formateNum = function(e, t) {
                return e ? (t = 1 === arguments.length ? 2 : t, e = parseFloat(e), e.toFixed(t)) : "0"
            },
            a.formatDateByFmt = function(e, t) {
                var n = {
                    "M+": e.getMonth() + 1,
                    "d+": e.getDate(),
                    "h+": e.getHours(),
                    "m+": e.getMinutes(),
                    "s+": e.getSeconds(),
                    "q+": Math.floor((e.getMonth() + 3) / 3),
                    S: e.getMilliseconds()
                };
                /(y+)/.test(t) && (t = t.replace(RegExp.$1, (e.getFullYear() + "").substr(4 - RegExp.$1.length)));
                for (var r in n) new RegExp("(" + r + ")").test(t) && (t = t.replace(RegExp.$1, 1 == RegExp.$1.length ? n[r] : ("00" + n[r]).substr(("" + n[r]).length)));
                return t
            },
            a.localItem = function(e, t) {
                return 1 == arguments.length ? localStorage.getItem(e) : localStorage.setItem(e, t)
            },
            a.removeLocalItem = function(e) {
                return e ? localStorage.removeItem(e) : localStorage.removeItem()
            },
            a.cookieItem = function(e, t) {
                if ("User" === e) return 1 == arguments.length ? window.USERSTR ? decodeURIComponent(window.USERSTR) : null: window.USERSTR = encodeURIComponent(t);
                if (1 == arguments.length) {
                    var n = new RegExp("(^| )" + e + "=([^;]*)(;|$)"),
                        r = document.cookie.match(n);
                    return r && "" != r[2] ? decodeURIComponent(r[2]) : null
                }
                return document.cookie = e + "=" + encodeURIComponent(t)
            },
            a.clearCookie = function(e) {
                var t = new Date;
                t.setTime(t.getTime() + -864e5);
                var n = "expires=" + t.toUTCString();
                document.cookie = e + "=; " + n
            },
            a.fomatFloat = function(e, t) {
                if (!e) return "0";
                var n = Math.floor(100 * e) / 100;
                return 1 == t ? n = Math.floor(10 * e) / 10 : 0 == t && (n = Math.floor(1 * e) / 1),
                    n
            },
            a.jQuery = i,
            a.$ = function(e, t) {
                return t = void 0 == t ? 0 : t,
                    i(e)[t]
            },
            a.getQuery = function(e) {
                var t = window.location.search.match(new RegExp("(\\?|&)" + e + "=([^&]*)(&|$)"));
                return t ? decodeURIComponent(t[2]) : ""
            },
            a.makeSign = function(e, t, n, i, a, s) {
                s || (s = Math.round((new Date).getTime() / 1e3).toString());
                var c = {
                    app_key: e,
                    time_stamp: s
                };
                if (a && "[object Object]" == Object.prototype.toString.call(a)) for (var u in a) {
                    var l = a[u];
                    void 0 !== l && null !== l && l === l && l !== 1 / 0 && ("[object Array]" == Object.prototype.toString.call(l) || "[object Object]" == Object.prototype.toString.call(l) ? c[u] = JSON.stringify(String(l)) : c[u] = String(l))
                } else if (a && "string" == typeof a) {
                    var f = a.split("&");
                    for (var p in f) {
                        var d = f[p].split("=");
                        "" != d[0] && (d[1] && (c[decodeURIComponent(d[0])] = decodeURIComponent(d[1])))
                    }
                }
                delete c.sign;
                var h = new Array;
                for (var u in c) {
                    var d = new Array;
                    d[0] = u;
                    var l = c[u];
                    d[1] = l;
                    for (var g = "",
                             p = 0; p < l.length; p++) {
                        if (new RegExp("^([a-z]|[A-Z]|[0-9]|[*]|[!]|[(]|[)])$").test(l[p])) g += l[p];
                        else {
                            var v = l[p].charCodeAt(0).toString(2);
                            7 < v.length && (v = "10" + v.substring(v.length - 6)),
                                g += "%" + parseInt(v, 2).toString(16).toUpperCase()
                        }
                    }
                    d[2] = g,
                        h.push(d)
                }
                h.sort(function(e, t) {
                    return e[0].localeCompare(t[0])
                });
                for (var y = "",
                         m = i + "?",
                         x = {},
                         p = 0; p < h.length; p++) p > 0 && (y += "&", m += "&"),
                    h[p],
                    y += h[p][0],
                    y += "=",
                    y += h[p][2],
                    m += encodeURIComponent(h[p][0]),
                    m += "=",
                    m += encodeURIComponent(h[p][1]),
                    x[h[p][0]] = h[p][1];
                var b = n.toUpperCase() + "&" + r(i) + "&" + r(y),
                    w = o.enc.Base64.stringify(o.HmacSHA1(b, t));
                return m += "&sign=" + encodeURIComponent(w),
                    x.sign = w,
                    {
                        sign: w,
                        res: m,
                        query: x,
                        reqString: m
                    }
            },
            a.ready = function(e) {
                window.AlipayJSBridge ? e && e() : document.addEventListener("AlipayJSBridgeReady", e, !1)
            },
            a.push = function(e, t) {
                var n = window.location.href.split("/pages")[0] + e;
                window.AlipayJSBridge ? a.ready(function() {
                    AlipayJSBridge.call("pushWindow", {
                        url: n,
                        param: t
                    })
                }) : location.href = n
            },
            e.exports = {
                Tool: a
            }
            ;signInfoMap.makeSign = a.makeSign;
    },
    function(e, t, n) {
        "use strict";
        var r = (n(26), n(37)),
            i = r.Tool,
            o = null,
            a = null,
            s = null;
        o = "https://ggservice.go-goal.cn/",
            a = "VzNQumNMxCmPcbD",
            s = "SYRyCEmkmZsMm8xnN5VrLQLXfc7C9GB1";
        var c = function(e) {
                function t() {
                    if (4 == a.readyState) {
                        var e = a.getAllResponseHeaders(),
                            t = a.responseText; (/application\/json/.test(e) || "json" === n.dataType && /^(\{|\[)([\s\S])*?(\]|\})$/.test(t)) && (t = JSON.parse(t)),
                            200 == a.status ? n.success(t, n, a) : n.fail(n, a)
                    }
                }
                var n = {
                        url: window.location.pathname,
                        async: !0,
                        type: "GET",
                        data: {},
                        dataType: "json",
                        success: function(e) {},
                        error: function() {}
                    },
                    r = [],
                    i = "";
                for (var o in e) n[o] = e[o];
                for (var o in n.data) r.push(o + "=" +
                    function(e) {
                        return e += "",
                            e = e.replace(/%/g, "%25"),
                            e = e.replace(/\+/g, "%2B"),
                            e = e.replace(/ /g, "%20"),
                            e = e.replace(/\//g, "%2F"),
                            e = e.replace(/\?/g, "%3F"),
                            e = e.replace(/&/g, "%26"),
                            e = e.replace(/\=/g, "%3D"),
                            e = e.replace(/#/g, "%23")
                    } (n.data[o]));
                i = r.join("&"),
                    n.type = n.type.toUpperCase();
                var a = new XMLHttpRequest;
                a.withCredentials = !1;
                try {
                    "GET" == n.type ? (i = n.url + "?" + i, a.open(n.type, i, n.async), a.send()) : (a.open(n.type, n.url, n.async), a.setRequestHeader("Content-type", "application/x-www-form-urlencoded"), a.send(i))
                } catch(e) {
                    n.fail(n, a)
                }
                n.async ? (a.timeout = 15e3, a.addEventListener("readystatechange", t, !1), a.addEventListener("timeout", n.fail, !1)) : t(),
                    a.end = function() {
                        a.removeEventListener("readystatechange", t, !1)
                    }
            },
            u = function(e, t) {
                return function() {
                    return {
                        url: o + e + ".fopcors",
                        data: i.makeSign(a, s, "GET", e, t).query,
                        type: "GET"
                    }
                }
            },
            l = function(e) {
                var t = e.dataResponse,
                    n = e.callback0,
                    r = e.callback1001 ||
                        function() {},
                    i = e.callbackNoError ||
                        function() {},
                    o = e.callback1009 ||
                        function() {},
                    a = e.callback1100 ||
                        function() {},
                    s = e.callback1101 ||
                        function() {},
                    u = e.callback401 ||
                        function() {},
                    l = e.callback400 ||
                        function() {},
                    f = e.callbackError ||
                        function() {},
                    p = e.callbackAnyError,
                    d = e.callbackFail ||
                        function() {},
                    h = e.afterResponse ||
                        function() {},
                    g = t();
                g.success = function(e) {
                    var t = e.data,
                        c = e.code;
                    0 === c ? (n && "function" == typeof n && n(t), i && "function" == typeof i && i()) : 1001 === c ? (r && "function" == typeof r && r(), i && "function" == typeof i && i()) : (1100 === c ? a && "function" == typeof a && a() : 1101 === c ? s && "function" == typeof s && s() : 401 === c ? u && "function" == typeof u && u() : 400 === c ? l && "function" == typeof l && l() : 1009 === c ? o && "function" == typeof o && o() : f && "function" == typeof f && f(), p && "function" == typeof p && p())
                },
                    g.fail = d,
                    g.complete = h,
                    c(g)
            },
            f = function(e) {
                return u("v1/alipay/get_zyyx_appraisal", e)
            },
            p = function(e) {
                return u("v1/stock/get_stocks", e)
            };
        e.exports = {
            handleDataResponse: l,
            suntimeMarkInfo: f,
            getStockInfo: p
        }
    },
    function(e, t) {
        e.exports = function(e) {
            return e.webpackPolyfill || (e.deprecate = function() {},
                e.paths = [], e.children || (e.children = []), Object.defineProperty(e, "loaded", {
                enumerable: !0,
                get: function() {
                    return e.l
                }
            }), Object.defineProperty(e, "id", {
                enumerable: !0,
                get: function() {
                    return e.i
                }
            }), e.webpackPolyfill = 1),
                e
        }
    },
    function(e, t, n) {
        "use strict";
        function r(e) {
            return e && e.__esModule ? e: {
                default:
                e
            }
        }
        t.__esModule = !0;
        var i = n(41),
            o = r(i),
            a = n(60),
            s = r(a),
            c = "function" == typeof s.
                default && "symbol" == typeof o.
                default ?
                function(e) {
                    return typeof e
                }: function(e) {
                    return e && "function" == typeof s.
                        default && e.constructor === s.
                        default && e !== s.
                        default.prototype ? "symbol": typeof e
                };
        t.
            default = "function" == typeof s.
            default && "symbol" === c(o.
            default) ?
            function(e) {
                return void 0 === e ? "undefined": c(e)
            }: function(e) {
                return e && "function" == typeof s.
                    default && e.constructor === s.
                    default && e !== s.
                    default.prototype ? "symbol": void 0 === e ? "undefined": c(e)
            }
    },
    function(e, t, n) {
        e.exports = {
            default:
                n(42),
            __esModule: !0
        }
    },
    function(e, t, n) {
        n(43),
            n(56),
            e.exports = n(23).f("iterator")
    },
    function(e, t, n) {
        "use strict";
        var r = n(44)(!0);
        n(27)(String, "String",
            function(e) {
                this._t = String(e),
                    this._i = 0
            },
            function() {
                var e, t = this._t,
                    n = this._i;
                return n >= t.length ? {
                    value: void 0,
                    done: !0
                }: (e = r(t, n), this._i += e.length, {
                    value: e,
                    done: !1
                })
            })
    },
    function(e, t, n) {
        var r = n(12),
            i = n(13);
        e.exports = function(e) {
            return function(t, n) {
                var o, a, s = String(i(t)),
                    c = r(n),
                    u = s.length;
                return c < 0 || c >= u ? e ? "": void 0 : (o = s.charCodeAt(c), o < 55296 || o > 56319 || c + 1 === u || (a = s.charCodeAt(c + 1)) < 56320 || a > 57343 ? e ? s.charAt(c) : o: e ? s.slice(c, c + 2) : a - 56320 + (o - 55296 << 10) + 65536)
            }
        }
    },
    function(e, t, n) {
        var r = n(46);
        e.exports = function(e, t, n) {
            if (r(e), void 0 === t) return e;
            switch (n) {
                case 1:
                    return function(n) {
                        return e.call(t, n)
                    };
                case 2:
                    return function(n, r) {
                        return e.call(t, n, r)
                    };
                case 3:
                    return function(n, r, i) {
                        return e.call(t, n, r, i)
                    }
            }
            return function() {
                return e.apply(t, arguments)
            }
        }
    },
    function(e, t) {
        e.exports = function(e) {
            if ("function" != typeof e) throw TypeError(e + " is not a function!");
            return e
        }
    },
    function(e, t, n) {
        "use strict";
        var r = n(32),
            i = n(10),
            o = n(22),
            a = {};
        n(2)(a, n(6)("iterator"),
            function() {
                return this
            }),
            e.exports = function(e, t, n) {
                e.prototype = r(a, {
                    next: i(1, n)
                }),
                    o(e, t + " Iterator")
            }
    },
    function(e, t, n) {
        var r = n(3),
            i = n(8),
            o = n(18);
        e.exports = n(4) ? Object.defineProperties: function(e, t) {
            i(e);
            for (var n, a = o(t), s = a.length, c = 0; s > c;) r.f(e, n = a[c++], t[n]);
            return e
        }
    },
    function(e, t, n) {
        var r = n(34);
        e.exports = Object("z").propertyIsEnumerable(0) ? Object: function(e) {
            return "String" == r(e) ? e.split("") : Object(e)
        }
    },
    function(e, t, n) {
        var r = n(5),
            i = n(51),
            o = n(52);
        e.exports = function(e) {
            return function(t, n, a) {
                var s, c = r(t),
                    u = i(c.length),
                    l = o(a, u);
                if (e && n != n) {
                    for (; u > l;) if ((s = c[l++]) != s) return ! 0
                } else for (; u > l; l++) if ((e || l in c) && c[l] === n) return e || l || 0;
                return ! e && -1
            }
        }
    },
    function(e, t, n) {
        var r = n(12),
            i = Math.min;
        e.exports = function(e) {
            return e > 0 ? i(r(e), 9007199254740991) : 0
        }
    },
    function(e, t, n) {
        var r = n(12),
            i = Math.max,
            o = Math.min;
        e.exports = function(e, t) {
            return e = r(e),
                e < 0 ? i(e + t, 0) : o(e, t)
        }
    },
    function(e, t, n) {
        var r = n(0).document;
        e.exports = r && r.documentElement
    },
    function(e, t, n) {
        var r = n(1),
            i = n(55),
            o = n(19)("IE_PROTO"),
            a = Object.prototype;
        e.exports = Object.getPrototypeOf ||
            function(e) {
                return e = i(e),
                    r(e, o) ? e[o] : "function" == typeof e.constructor && e instanceof e.constructor ? e.constructor.prototype: e instanceof Object ? a: null
            }
    },
    function(e, t, n) {
        var r = n(13);
        e.exports = function(e) {
            return Object(r(e))
        }
    },
    function(e, t, n) {
        n(57);
        for (var r = n(0), i = n(2), o = n(17), a = n(6)("toStringTag"), s = "CSSRuleList,CSSStyleDeclaration,CSSValueList,ClientRectList,DOMRectList,DOMStringList,DOMTokenList,DataTransferItemList,FileList,HTMLAllCollection,HTMLCollection,HTMLFormElement,HTMLSelectElement,MediaList,MimeTypeArray,NamedNodeMap,NodeList,PaintRequestList,Plugin,PluginArray,SVGLengthList,SVGNumberList,SVGPathSegList,SVGPointList,SVGStringList,SVGTransformList,SourceBufferList,StyleSheetList,TextTrackCueList,TextTrackList,TouchList".split(","), c = 0; c < s.length; c++) {
            var u = s[c],
                l = r[u],
                f = l && l.prototype;
            f && !f[a] && i(f, a, u),
                o[u] = o.Array
        }
    },
    function(e, t, n) {
        "use strict";
        var r = n(58),
            i = n(59),
            o = n(17),
            a = n(5);
        e.exports = n(27)(Array, "Array",
            function(e, t) {
                this._t = a(e),
                    this._i = 0,
                    this._k = t
            },
            function() {
                var e = this._t,
                    t = this._k,
                    n = this._i++;
                return ! e || n >= e.length ? (this._t = void 0, i(1)) : "keys" == t ? i(0, n) : "values" == t ? i(0, e[n]) : i(0, [n, e[n]])
            },
            "values"),
            o.Arguments = o.Array,
            r("keys"),
            r("values"),
            r("entries")
    },
    function(e, t) {
        e.exports = function() {}
    },
    function(e, t) {
        e.exports = function(e, t) {
            return {
                value: t,
                done: !!e
            }
        }
    },
    function(e, t, n) {
        e.exports = {
            default:
                n(61),
            __esModule: !0
        }
    },
    function(e, t, n) {
        n(62),
            n(68),
            n(69),
            n(70),
            e.exports = n(15).Symbol
    },
    function(e, t, n) {
        "use strict";
        var r = n(0),
            i = n(1),
            o = n(4),
            a = n(28),
            s = n(31),
            c = n(63).KEY,
            u = n(9),
            l = n(20),
            f = n(22),
            p = n(11),
            d = n(6),
            h = n(23),
            g = n(24),
            v = n(64),
            y = n(65),
            m = n(8),
            x = n(7),
            b = n(5),
            w = n(16),
            _ = n(10),
            k = n(32),
            T = n(66),
            C = n(67),
            S = n(3),
            A = n(18),
            E = C.f,
            j = S.f,
            N = T.f,
            D = r.Symbol,
            L = r.JSON,
            O = L && L.stringify,
            P = d("_hidden"),
            F = d("toPrimitive"),
            M = {}.propertyIsEnumerable,
            R = l("symbol-registry"),
            q = l("symbols"),
            H = l("op-symbols"),
            I = Object.prototype,
            B = "function" == typeof D,
            W = r.QObject,
            U = !W || !W.prototype || !W.prototype.findChild,
            z = o && u(function() {
                return 7 != k(j({},
                    "a", {
                        get: function() {
                            return j(this, "a", {
                                value: 7
                            }).a
                        }
                    })).a
            }) ?
                function(e, t, n) {
                    var r = E(I, t);
                    r && delete I[t],
                        j(e, t, n),
                    r && e !== I && j(I, t, r)
                }: j,
            K = function(e) {
                var t = q[e] = k(D.prototype);
                return t._k = e,
                    t
            },
            $ = B && "symbol" == typeof D.iterator ?
                function(e) {
                    return "symbol" == typeof e
                }: function(e) {
                    return e instanceof D
                },
            V = function(e, t, n) {
                return e === I && V(H, t, n),
                    m(e),
                    t = w(t, !0),
                    m(n),
                    i(q, t) ? (n.enumerable ? (i(e, P) && e[P][t] && (e[P][t] = !1), n = k(n, {
                        enumerable: _(0, !1)
                    })) : (i(e, P) || j(e, P, _(1, {})), e[P][t] = !0), z(e, t, n)) : j(e, t, n)
            },
            G = function(e, t) {
                m(e);
                for (var n, r = v(t = b(t)), i = 0, o = r.length; o > i;) V(e, n = r[i++], t[n]);
                return e
            },
            Y = function(e, t) {
                return void 0 === t ? k(e) : G(k(e), t)
            },
            X = function(e) {
                var t = M.call(this, e = w(e, !0));
                return ! (this === I && i(q, e) && !i(H, e)) && (!(t || !i(this, e) || !i(q, e) || i(this, P) && this[P][e]) || t)
            },
            Q = function(e, t) {
                if (e = b(e), t = w(t, !0), e !== I || !i(q, t) || i(H, t)) {
                    var n = E(e, t);
                    return ! n || !i(q, t) || i(e, P) && e[P][t] || (n.enumerable = !0),
                        n
                }
            },
            J = function(e) {
                for (var t, n = N(b(e)), r = [], o = 0; n.length > o;) i(q, t = n[o++]) || t == P || t == c || r.push(t);
                return r
            },
            Z = function(e) {
                for (var t, n = e === I,
                         r = N(n ? H: b(e)), o = [], a = 0; r.length > a;) ! i(q, t = r[a++]) || n && !i(I, t) || o.push(q[t]);
                return o
            };
        B || (D = function() {
            if (this instanceof D) throw TypeError("Symbol is not a constructor!");
            var e = p(arguments.length > 0 ? arguments[0] : void 0),
                t = function(n) {
                    this === I && t.call(H, n),
                    i(this, P) && i(this[P], e) && (this[P][e] = !1),
                        z(this, e, _(1, n))
                };
            return o && U && z(I, e, {
                configurable: !0,
                set: t
            }),
                K(e)
        },
            s(D.prototype, "toString",
                function() {
                    return this._k
                }), C.f = Q, S.f = V, n(36).f = T.f = J, n(25).f = X, n(35).f = Z, o && !n(14) && s(I, "propertyIsEnumerable", X, !0), h.f = function(e) {
            return K(d(e))
        }),
            a(a.G + a.W + a.F * !B, {
                Symbol: D
            });
        for (var ee = "hasInstance,isConcatSpreadable,iterator,match,replace,search,species,split,toPrimitive,toStringTag,unscopables".split(","), te = 0; ee.length > te;) d(ee[te++]);
        for (var ne = A(d.store), re = 0; ne.length > re;) g(ne[re++]);
        a(a.S + a.F * !B, "Symbol", {
            for: function(e) {
                return i(R, e += "") ? R[e] : R[e] = D(e)
            },
            keyFor: function(e) {
                if (!$(e)) throw TypeError(e + " is not a symbol!");
                for (var t in R) if (R[t] === e) return t
            },
            useSetter: function() {
                U = !0
            },
            useSimple: function() {
                U = !1
            }
        }),
            a(a.S + a.F * !B, "Object", {
                create: Y,
                defineProperty: V,
                defineProperties: G,
                getOwnPropertyDescriptor: Q,
                getOwnPropertyNames: J,
                getOwnPropertySymbols: Z
            }),
        L && a(a.S + a.F * (!B || u(function() {
            var e = D();
            return "[null]" != O([e]) || "{}" != O({
                a: e
            }) || "{}" != O(Object(e))
        })), "JSON", {
            stringify: function(e) {
                for (var t, n, r = [e], i = 1; arguments.length > i;) r.push(arguments[i++]);
                if (n = t = r[1], (x(t) || void 0 !== e) && !$(e)) return y(t) || (t = function(e, t) {
                    if ("function" == typeof n && (t = n.call(this, e, t)), !$(t)) return t
                }),
                    r[1] = t,
                    O.apply(L, r)
            }
        }),
        D.prototype[F] || n(2)(D.prototype, F, D.prototype.valueOf),
            f(D, "Symbol"),
            f(Math, "Math", !0),
            f(r.JSON, "JSON", !0)
    },
    function(e, t, n) {
        var r = n(11)("meta"),
            i = n(7),
            o = n(1),
            a = n(3).f,
            s = 0,
            c = Object.isExtensible ||
                function() {
                    return ! 0
                },
            u = !n(9)(function() {
                return c(Object.preventExtensions({}))
            }),
            l = function(e) {
                a(e, r, {
                    value: {
                        i: "O" + ++s,
                        w: {}
                    }
                })
            },
            f = function(e, t) {
                if (!i(e)) return "symbol" == typeof e ? e: ("string" == typeof e ? "S": "P") + e;
                if (!o(e, r)) {
                    if (!c(e)) return "F";
                    if (!t) return "E";
                    l(e)
                }
                return e[r].i
            },
            p = function(e, t) {
                if (!o(e, r)) {
                    if (!c(e)) return ! 0;
                    if (!t) return ! 1;
                    l(e)
                }
                return e[r].w
            },
            d = function(e) {
                return u && h.NEED && c(e) && !o(e, r) && l(e),
                    e
            },
            h = e.exports = {
                KEY: r,
                NEED: !1,
                fastKey: f,
                getWeak: p,
                onFreeze: d
            }
    },
    function(e, t, n) {
        var r = n(18),
            i = n(35),
            o = n(25);
        e.exports = function(e) {
            var t = r(e),
                n = i.f;
            if (n) for (var a, s = n(e), c = o.f, u = 0; s.length > u;) c.call(e, a = s[u++]) && t.push(a);
            return t
        }
    },
    function(e, t, n) {
        var r = n(34);
        e.exports = Array.isArray ||
            function(e) {
                return "Array" == r(e)
            }
    },
    function(e, t, n) {
        var r = n(5),
            i = n(36).f,
            o = {}.toString,
            a = "object" == typeof window && window && Object.getOwnPropertyNames ? Object.getOwnPropertyNames(window) : [],
            s = function(e) {
                try {
                    return i(e)
                } catch(e) {
                    return a.slice()
                }
            };
        e.exports.f = function(e) {
            return a && "[object Window]" == o.call(e) ? s(e) : i(r(e))
        }
    },
    function(e, t, n) {
        var r = n(25),
            i = n(10),
            o = n(5),
            a = n(16),
            s = n(1),
            c = n(29),
            u = Object.getOwnPropertyDescriptor;
        t.f = n(4) ? u: function(e, t) {
            if (e = o(e), t = a(t, !0), c) try {
                return u(e, t)
            } catch(e) {}
            if (s(e, t)) return i(!r.f.call(e, t), e[t])
        }
    },
    function(e, t) {},
    function(e, t, n) {
        n(24)("asyncIterator")
    },
    function(e, t, n) {
        n(24)("observable")
    },
    function(e, t) { (function(t) {
        e.exports = t
    }).call(t, {})
    },
    function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var r = r ||
            function(e, t) {
                var n = {},
                    r = n.lib = {},
                    i = function() {},
                    o = r.Base = {
                        extend: function(e) {
                            i.prototype = this;
                            var t = new i;
                            return e && t.mixIn(e),
                            t.hasOwnProperty("init") || (t.init = function() {
                                t.$super.init.apply(this, arguments)
                            }),
                                t.init.prototype = t,
                                t.$super = this,
                                t
                        },
                        create: function() {
                            var e = this.extend();
                            return e.init.apply(e, arguments),
                                e
                        },
                        init: function() {},
                        mixIn: function(e) {
                            for (var t in e) e.hasOwnProperty(t) && (this[t] = e[t]);
                            e.hasOwnProperty("toString") && (this.toString = e.toString)
                        },
                        clone: function() {
                            return this.init.prototype.extend(this)
                        }
                    },
                    a = r.WordArray = o.extend({
                        init: function(e, t) {
                            e = this.words = e || [],
                                this.sigBytes = void 0 != t ? t: 4 * e.length
                        },
                        toString: function(e) {
                            return (e || c).stringify(this)
                        },
                        concat: function(e) {
                            var t = this.words,
                                n = e.words,
                                r = this.sigBytes;
                            if (e = e.sigBytes, this.clamp(), r % 4) for (var i = 0; i < e; i++) t[r + i >>> 2] |= (n[i >>> 2] >>> 24 - i % 4 * 8 & 255) << 24 - (r + i) % 4 * 8;
                            else if (65535 < n.length) for (i = 0; i < e; i += 4) t[r + i >>> 2] = n[i >>> 2];
                            else t.push.apply(t, n);
                            return this.sigBytes += e,
                                this
                        },
                        clamp: function() {
                            var t = this.words,
                                n = this.sigBytes;
                            t[n >>> 2] &= 4294967295 << 32 - n % 4 * 8,
                                t.length = e.ceil(n / 4)
                        },
                        clone: function() {
                            var e = o.clone.call(this);
                            return e.words = this.words.slice(0),
                                e
                        },
                        random: function(t) {
                            for (var n = [], r = 0; r < t; r += 4) n.push(4294967296 * e.random() | 0);
                            return new a.init(n, t)
                        }
                    }),
                    s = n.enc = {},
                    c = s.Hex = {
                        stringify: function(e) {
                            var t = e.words;
                            e = e.sigBytes;
                            for (var n = [], r = 0; r < e; r++) {
                                var i = t[r >>> 2] >>> 24 - r % 4 * 8 & 255;
                                n.push((i >>> 4).toString(16)),
                                    n.push((15 & i).toString(16))
                            }
                            return n.join("")
                        },
                        parse: function(e) {
                            for (var t = e.length,
                                     n = [], r = 0; r < t; r += 2) n[r >>> 3] |= parseInt(e.substr(r, 2), 16) << 24 - r % 8 * 4;
                            return new a.init(n, t / 2)
                        }
                    },
                    u = s.Latin1 = {
                        stringify: function(e) {
                            var t = e.words;
                            e = e.sigBytes;
                            for (var n = [], r = 0; r < e; r++) n.push(String.fromCharCode(t[r >>> 2] >>> 24 - r % 4 * 8 & 255));
                            return n.join("")
                        },
                        parse: function(e) {
                            for (var t = e.length,
                                     n = [], r = 0; r < t; r++) n[r >>> 2] |= (255 & e.charCodeAt(r)) << 24 - r % 4 * 8;
                            return new a.init(n, t)
                        }
                    },
                    l = s.Utf8 = {
                        stringify: function(e) {
                            try {
                                return decodeURIComponent(escape(u.stringify(e)))
                            } catch(e) {
                                throw Error("Malformed UTF-8 data")
                            }
                        },
                        parse: function(e) {
                            return u.parse(unescape(encodeURIComponent(e)))
                        }
                    },
                    f = r.BufferedBlockAlgorithm = o.extend({
                        reset: function() {
                            this._data = new a.init,
                                this._nDataBytes = 0
                        },
                        _append: function(e) {
                            "string" == typeof e && (e = l.parse(e)),
                                this._data.concat(e),
                                this._nDataBytes += e.sigBytes
                        },
                        _process: function(t) {
                            var n = this._data,
                                r = n.words,
                                i = n.sigBytes,
                                o = this.blockSize,
                                s = i / (4 * o),
                                s = t ? e.ceil(s) : e.max((0 | s) - this._minBufferSize, 0);
                            if (t = s * o, i = e.min(4 * t, i), t) {
                                for (var c = 0; c < t; c += o) this._doProcessBlock(r, c);
                                c = r.splice(0, t),
                                    n.sigBytes -= i
                            }
                            return new a.init(c, i)
                        },
                        clone: function() {
                            var e = o.clone.call(this);
                            return e._data = this._data.clone(),
                                e
                        },
                        _minBufferSize: 0
                    });
                r.Hasher = f.extend({
                    cfg: o.extend(),
                    init: function(e) {
                        this.cfg = this.cfg.extend(e),
                            this.reset()
                    },
                    reset: function() {
                        f.reset.call(this),
                            this._doReset()
                    },
                    update: function(e) {
                        return this._append(e),
                            this._process(),
                            this
                    },
                    finalize: function(e) {
                        return e && this._append(e),
                            this._doFinalize()
                    },
                    blockSize: 16,
                    _createHelper: function(e) {
                        return function(t, n) {
                            return new e.init(n).finalize(t)
                        }
                    },
                    _createHmacHelper: function(e) {
                        return function(t, n) {
                            return new p.HMAC.init(e, n).finalize(t)
                        }
                    }
                });
                var p = n.algo = {};
                return n
            } (Math); !
            function() {
                var e = r,
                    t = e.lib,
                    n = t.WordArray,
                    i = t.Hasher,
                    o = [],
                    t = e.algo.SHA1 = i.extend({
                        _doReset: function() {
                            this._hash = new n.init([1732584193, 4023233417, 2562383102, 271733878, 3285377520])
                        },
                        _doProcessBlock: function(e, t) {
                            for (var n = this._hash.words,
                                     r = n[0], i = n[1], a = n[2], s = n[3], c = n[4], u = 0; 80 > u; u++) {
                                if (16 > u) o[u] = 0 | e[t + u];
                                else {
                                    var l = o[u - 3] ^ o[u - 8] ^ o[u - 14] ^ o[u - 16];
                                    o[u] = l << 1 | l >>> 31
                                }
                                l = (r << 5 | r >>> 27) + c + o[u],
                                    l = 20 > u ? l + (1518500249 + (i & a | ~i & s)) : 40 > u ? l + (1859775393 + (i ^ a ^ s)) : 60 > u ? l + ((i & a | i & s | a & s) - 1894007588) : l + ((i ^ a ^ s) - 899497514),
                                    c = s,
                                    s = a,
                                    a = i << 30 | i >>> 2,
                                    i = r,
                                    r = l
                            }
                            n[0] = n[0] + r | 0,
                                n[1] = n[1] + i | 0,
                                n[2] = n[2] + a | 0,
                                n[3] = n[3] + s | 0,
                                n[4] = n[4] + c | 0
                        },
                        _doFinalize: function() {
                            var e = this._data,
                                t = e.words,
                                n = 8 * this._nDataBytes,
                                r = 8 * e.sigBytes;
                            return t[r >>> 5] |= 128 << 24 - r % 32,
                                t[14 + (r + 64 >>> 9 << 4)] = Math.floor(n / 4294967296),
                                t[15 + (r + 64 >>> 9 << 4)] = n,
                                e.sigBytes = 4 * t.length,
                                this._process(),
                                this._hash
                        },
                        clone: function() {
                            var e = i.clone.call(this);
                            return e._hash = this._hash.clone(),
                                e
                        }
                    });
                e.SHA1 = i._createHelper(t),
                    e.HmacSHA1 = i._createHmacHelper(t)
            } (),
            function() {
                var e = r,
                    t = e.enc.Utf8;
                e.algo.HMAC = e.lib.Base.extend({
                    init: function(e, n) {
                        e = this._hasher = new e.init,
                        "string" == typeof n && (n = t.parse(n));
                        var r = e.blockSize,
                            i = 4 * r;
                        n.sigBytes > i && (n = e.finalize(n)),
                            n.clamp();
                        for (var o = this._oKey = n.clone(), a = this._iKey = n.clone(), s = o.words, c = a.words, u = 0; u < r; u++) s[u] ^= 1549556828,
                            c[u] ^= 909522486;
                        o.sigBytes = a.sigBytes = i,
                            this.reset()
                    },
                    reset: function() {
                        var e = this._hasher;
                        e.reset(),
                            e.update(this._iKey)
                    },
                    update: function(e) {
                        return this._hasher.update(e),
                            this
                    },
                    finalize: function(e) {
                        var t = this._hasher;
                        return e = t.finalize(e),
                            t.reset(),
                            t.finalize(this._oKey.clone().concat(e))
                    }
                })
            } (),
            function() {
                var e = r,
                    t = e.lib.WordArray;
                e.enc.Base64 = {
                    stringify: function(e) {
                        var t = e.words,
                            n = e.sigBytes,
                            r = this._map;
                        e.clamp(),
                            e = [];
                        for (var i = 0; i < n; i += 3) for (var o = (t[i >>> 2] >>> 24 - i % 4 * 8 & 255) << 16 | (t[i + 1 >>> 2] >>> 24 - (i + 1) % 4 * 8 & 255) << 8 | t[i + 2 >>> 2] >>> 24 - (i + 2) % 4 * 8 & 255, a = 0; 4 > a && i + .75 * a < n; a++) e.push(r.charAt(o >>> 6 * (3 - a) & 63));
                        if (t = r.charAt(64)) for (; e.length % 4;) e.push(t);
                        return e.join("")
                    },
                    parse: function(e) {
                        var n = e.length,
                            r = this._map,
                            i = r.charAt(64);
                        i && -1 != (i = e.indexOf(i)) && (n = i);
                        for (var i = [], o = 0, a = 0; a < n; a++) if (a % 4) {
                            var s = r.indexOf(e.charAt(a - 1)) << a % 4 * 2,
                                c = r.indexOf(e.charAt(a)) >>> 6 - a % 4 * 2;
                            i[o >>> 2] |= (s | c) << 24 - o % 4 * 8,
                                o++
                        }
                        return t.create(i, o)
                    },
                    _map: "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                }
            } (),
            t.
                default = r,
            e.exports = t.
                default
    },
    function(e, t, n) {
        "use strict";
        function r(e) {
            return e && e.__esModule ? e: {
                default:
                e
            }
        }
        var i = n(74),
            o = r(i),
            a = n(75),
            s = r(a),
            c = n(38),
            u = n(37),
            l = u.Tool,
            f = l.$,
            p = l.getQuery("stock_code") || "000001",
            d = 1,
            h = "https://gw.alipayobjects.com/os/q/cms/images/jdcwh8h6/4194a956-cd8d-457b-b86c-6339bf09840c_w240_h160.png",
            g = screen.availWidth <= 360,
            v = screen.availWidth > 640 ? 1280 : 2 * screen.availWidth - 0,
            y = (v - 177) / 60,
            m = ["#FF634E", "#138AFE", "#FFD65C"];
        document.title = "加载中";
        var x = null,
            b = null,
            w = function() {
                function e() {
                    var e = "<div>";
                    return e += '<div class="show-action show-all" data-flex="main:center cross:center" onclick="changeShowAllStatus()">',
                        e += "    收起",
                        e += "    <img src=" + o.
                            default + ' alt="收起"/>',
                        e += "</div>",
                        e += '<div class="show-action show-some" data-flex="main:center cross:center" onclick="changeShowAllStatus()">',
                        e += "    展开全部",
                        e += "    <img src=" + s.
                            default + ' alt="展开"/>',
                        e += " </div>",
                        e += "</div>",
                        f(e)
                }
                var t = p.charAt(0);
                if (0 != t && 3 != t && 6 != t) return f(".data-load").style.display = "none",
                    f(".fd-errorPage").style.display = "block",
                    document.title = "吸引力评分",
                    void l.ready(function() {
                        AlipayJSBridge.call("setTitle", {
                            title: "吸引力评分"
                        })
                    });
                var n = function(e) {
                        var t = function(e) {
                                return e / 180 * Math.PI
                            },
                            n = f("#pieChart"),
                            r = window.screen.availWidth / 2;
                        n.width = r / 3 * 2 * 2,
                            n.height = n.width,
                            n.style.width = n.width / 2 + "px",
                            n.style.height = n.width / 2 + "px";
                        for (var i = n.getContext("2d"), o = -90, a = n.width / 2, s = n.height / 2, c = n.width / 2, u = 0, p = 0; p < e.length; p++) {
                            u = 360 * l.formateNum(e[p].radius, 4);
                            var d = o + u;
                            i.beginPath(),
                                i.moveTo(a, s),
                                i.arc(a, s, c, t(o), t(d)),
                                i.fillStyle = m[p],
                                i.fill(),
                                o = d
                        }
                        i.beginPath(),
                            i.moveTo(a, s),
                            i.arc(a, s, c / 2, t(0), t(360)),
                            i.fillStyle = "#fff",
                            i.fill(),
                            i.closePath();
                        var h = i.canvas.toDataURL();
                        n.style.display = "none";
                        var g = f("#chartImg");
                        g.style.width = n.width / 2 + "px",
                            g.style.height = n.width / 2 + "px",
                            g.src = h
                    },
                    r = function(e) {
                        var t = function(e, t) {
                            var n = "";
                            return "yj" == t ? n = e >= 58 ? "非常好": e >= 48 ? "很好": e >= 30 ? "好": e >= 18 ? "中性": "绩差": "sc" == t ? n = e >= 24.7 ? "认可度很高": e >= 20.8 ? "认可度较高": e >= 13 ? "认可度高": e >= 7.8 ? "认可度中性": "认可度低": "gz" == t && (n = e >= 10.8 ? "吸引力强": e >= 8.1 ? "吸引力较强": e >= 5.4 ? "吸引力中性": "吸引力较低"),
                                n
                        };
                        e = function(e) {
                            var n = {
                                    radius: e.achievenments_total_score / e.total_score,
                                    name: "业绩：" + t(e.achievenments_total_score, "yj"),
                                    score: e.achievenments_total_score,
                                    allScore: "60.5"
                                },
                                r = {
                                    radius: e.valuation_total_score / e.total_score,
                                    name: "估值：" + t(e.valuation_total_score, "gz"),
                                    score: e.valuation_total_score,
                                    allScore: "13.5"
                                };
                            return [n, {
                                radius: e.marketplace_total_score / e.total_score,
                                name: "市场：" + t(e.marketplace_total_score, "sc"),
                                score: e.marketplace_total_score,
                                allScore: "26"
                            },
                                r]
                        } (e),
                            n(e),
                            e.map(function(e, t) {
                                var n = e.score,
                                    r = e.name,
                                    i = e.allScore;
                                f(".business-info .info").appendChild(f('<div class="info-item" data-flex="cross:center box:first">\n                    <div class="symbol" style="background:' + m[t] + '"></div>\n                    <div>\n                        <p class="business-pie">' + r + '</p>\n                        <p class="percentage-pie"><span>' + l.formateNum(n, 1) + "分&nbsp;</span>(满分" + i + "分)</p>\n                    </div>\n                </div>"))
                            })
                    },
                    i = [{
                        key: "company_honor_score",
                        name: "公司品质",
                        color: "red",
                        weight: 2.5
                    },
                        {
                            key: "business_status_score",
                            name: "行业龙头",
                            color: "red",
                            weight: .45
                        },
                        {
                            key: "achievements_appraisal_score",
                            name: "超预期鉴定",
                            color: "red",
                            weight: .5
                        },
                        {
                            key: "achievements_growup_score",
                            name: "业绩成长性",
                            color: "red",
                            weight: .6
                        },
                        {
                            key: "profit_ability_score",
                            name: "盈利能力",
                            color: "red",
                            weight: .4
                        },
                        {
                            key: "achievements_clue_score",
                            name: "业绩线索",
                            color: "red",
                            weight: .6
                        },
                        {
                            key: "marketplace_style_score",
                            name: "业绩驱动性",
                            color: "red",
                            weight: 1
                        },
                        {
                            key: "organization_hold_score",
                            name: "机构持仓",
                            color: "blue",
                            weight: .5
                        },
                        {
                            key: "organization_emotion_score",
                            name: "分析师情绪",
                            color: "blue",
                            weight: .4
                        },
                        {
                            key: "business_preference_score",
                            name: "全市场情绪",
                            color: "blue",
                            weight: 1.2
                        },
                        {
                            key: "success_rate_statistics_score",
                            name: "胜率统计",
                            color: "blue",
                            weight: .5
                        },
                        {
                            key: "stock_valuation_score",
                            name: "个股估值",
                            color: "yellow",
                            weight: 1.35
                        }],
                    a = function(e, t, n, r) {
                        var i = "";
                        return i += '<div id="thermograph' + r + '" class="thermograph-item c-' + e.color + (n ? " last": "") + '" data-flex="box:justify cross:center">',
                            i += '    <p class="name">' + e.name + "</p>",
                            i += '    <div class="thermograph" data-flex="box:last">',
                            i += '        <div class="progress">',
                            i += '            <p class="progress-bg"></p>',
                            i += '            <p class="progress-value" style="width: calc(' + t / (10 * e.weight) * 100 + '% - 26px)"></p>',
                            i += '            <p class="value" style="left: calc(' + t / (10 * e.weight) * 100 + '% - 26px)">' + l.formateNum(t / e.weight, 1) + "</p>",
                            i += "        </div>",
                            i += '        <p class="progress-weight">x&nbsp;' + e.weight + "</p>",
                            i += "    </div>",
                            i += '    <p class="score">' + (t ? l.formateNum(t, 1) : "0") + "</p>",
                            i += "</div>",
                            f(i)
                    },
                    u = function(e) {
                        var t = e.stock_name,
                            n = e.stock_status_percent,
                            r = t.length;
                        n = n > .73 ? .7333333 : n,
                            n = n <= .05 ? .125 : n <= .2 ? .375 : n <= .5 ? .625 : .875;
                        var i = r <= 3 ? '<p class="stock_name">\n                                ' + t + "\n                            </p>": '<p class="stock_name l2" data-flex="cross:center main:center">\n                                    ' + t.substr(0, l.formateNum(r / 2, 0)) + "\n                                    <br/>\n                                    " + t.substr(l.formateNum(r / 2, 0), r - l.formateNum(r / 2, 0)) + "\n                            </p>";
                        return i = f('<div style=\'height: 150px; margin: 20px 0; position: relative\' data-flex="main:center cross:center">\n                        <img style=\'width: 200px; height: 150px; vertical-align: top\' src="https://gw.alipayobjects.com/os/q/cms/images/jdcwme9q/8ed56d51-3a75-4937-b807-69270dd00ceb_w400_h300.png"/>\n                        <div class="stock-status" data-flex="cross:center dir:left" style="top: calc(' + 100 * n + '% - 20px)">\n                            <p class="circle"></p>\n                            <p class="line"></p>\n                            ' + i + "\n                        </div>\n                    </div>")
                    },
                    v = function(e) {
                        var t = e.title,
                            n = e.avg_data,
                            r = e.rank_data,
                            i = (e.count, e.con_date, '<div class="map-form-bg">');
                        return i += '<div class="header-space"></div>',
                            i += '<div class="form-title" data-flex="cross:center">',
                            i += "<div></div>",
                            i += "<span>" + t + "</span>",
                            i += "</div>",
                            i += '<div class="form-bg">',
                            i += '<div class="form-header" data-flex="main:left cross:center">',
                            i += '<div class="cell p1">类型</div>',
                            i += '<div class="cell p2">周</div>',
                            i += '<div class="cell p3">月</div>',
                            i += '<div class="cell p4">季</div>',
                            i += '<div class="cell p5">年</div>',
                            i += "</div>",
                            i += '<div class="' + (g ? "form-cell small-w": "form-cell") + '" data-flex="main:left cross:center">',
                            i += '<div class="cell p1">分数</div>',
                            i += '<div class="cell p2">' + (n[0] ? l.formateNum(n[0], 1) : "--") + "</div>",
                            i += '<div class="cell p3">' + (n[1] ? l.formateNum(n[1], 1) : "--") + "</div>",
                            i += '<div class="cell p4">' + (n[2] ? l.formateNum(n[2], 1) : "--") + "</div>",
                            i += '<div class="cell p5">' + (n[3] ? l.formateNum(n[3], 1) : "--") + "</div>",
                            i += "</div>",
                            i += '<div class="' + (g ? "form-cell small-w": "form-cell") + '" data-flex="main:left cross:center">',
                            i += '<div class="' + (g ? "cell p1 small-w": "cell p1") + '">排名</div>',
                            i += '<div class="cell p2">' + (r[0] ? r[0] : "--") + "</div>",
                            i += '<div class="cell p3">' + (r[1] ? r[1] : "--") + "</div>",
                            i += '<div class="cell p4">' + (r[2] ? r[2] : "--") + "</div>",
                            i += '<div class="cell p5">' + (r[3] ? r[3] : "--") + "</div>",
                            i += "</div>",
                            i += "</div>",
                            i += "</div>",
                            f(i)
                    },
                    y = null;
                window.changeShowAllStatus = function() {
                    if (null === y ? y = !1 : (y = !y, window.TDAPP && window.TDAPP.onEvent("股票诊断—展开/收起全部", p, {
                            stock_code: p
                        })), y) {
                        f(".show-all").style.display = "",
                            f(".show-some").style.display = "none";
                        var e = [1, 1, 1, 1, 1, 1, 1];
                        e.map(function(e, t) {
                            f("#thermograph" + (5 + t)).style.display = ""
                        }),
                            e = null,
                            f("#thermograph4").style.borderBottom = "1px dashed #e8e8e8"
                    } else {
                        f(".show-all").style.display = "none",
                            f(".show-some").style.display = "";
                        var t = [1, 1, 1, 1, 1, 1, 1];
                        t.map(function(e, t) {
                            f("#thermograph" + (5 + t)).style.display = "none"
                        }),
                            t = null,
                            f("#thermograph4").style.borderBottom = 0
                    }
                };
                var w = function(e) {
                        if (b) return b = e.kine,
                            e.loaded = !0,
                            void _();
                        if (e.appraisal_list.score) {
                            var t = e.appraisal_list,
                                n = t.score,
                                r = t.status;
                            e.stock_name = n[0],
                                e.stock_code = p,
                                e.achievenments_total_score = n.slice(1, 8).reduce(function(e, t) {
                                    return e + t
                                }),
                                e.marketplace_total_score = n.slice(8, 12).reduce(function(e, t) {
                                    return e + t
                                }),
                                e.valuation_total_score = n.slice(12, 13).reduce(function(e, t) {
                                    return e + t
                                }),
                                e.total_score = -( - e.achievenments_total_score.toFixed(1) - e.marketplace_total_score.toFixed(1) - e.valuation_total_score.toFixed(1)); ["company_honor_score", "business_status_score", "achievements_appraisal_score", "achievements_growup_score", "profit_ability_score", "achievements_clue_score", "marketplace_style_score", "organization_hold_score", "organization_emotion_score", "business_preference_score", "success_rate_statistics_score", "stock_valuation_score", "avgweek_score", "avgmonth_score", "avgquarter_score", "avgyear_score"].map(function(t, r) {
                                e[t] = n[r + 1]
                            });
                            var i = ["stock_status", "stock_count", "stock_industry_name", "stock_industry_status", "stock_industry_count", "week_status", "month_status", "querter_status", "year_status", "industry_week_status", "industry_month_status", "industry_quarter_status", "industry_year_status"];
                            r && i.map(function(t, n) {
                                e[t] = r[n]
                            }),
                                e.stock_status_percent = e.stock_status / e.stock_count,
                                x = e.week_change,
                                b = e.kine,
                                k(),
                                _()
                        }
                    },
                    T = {
                        stock_code: p,
                        type: d
                    },
                    C = c.suntimeMarkInfo(T),
                    S = function(t) {
                        if (w(t), !t.loaded) {
                            if (! (t.stock_code && t.stock_code.length > 0)) return document.title = "吸引力评分",
                                l.ready(function() {
                                    AlipayJSBridge.call("setTitle", {
                                        title: "吸引力评分"
                                    })
                                }),
                                f(".data-load .logo").style.display = "none",
                                f(".data-load").style.height = screen.availHeight + "px",
                                f(".data-load").style.backgroundColor = "#F5F5F9",
                                f(".data-load").appendChild(f('<img class="no-score" src="' + h + '" alt="提示"/>')),
                                void f(".data-load").appendChild(f('<div class="msg"><p>此个股为新股，暂时没有评分</p><p>请明天再来试试！</p></div>'));
                            f(".suntime-mark-bg").style.display = "block",
                                f(".data-load").style.display = "none",
                                document.title = t.stock_name + "-吸引力评分",
                                l.ready(function() {
                                    AlipayJSBridge.call("setTitle", {
                                        title: t.stock_name + "-吸引力评分"
                                    })
                                }),
                                f(".stock-info-bg").appendChild(f('<img class="banner-bg" src="https://gw.alipayobjects.com/os/q/cms/images/jdcwk0fb/2f866f8d-7a99-4dda-be73-743b5cecc0a7_w750_h560.png" alt="背景图"/>')),
                                f(".name").innerText = t.stock_name + "(" + t.stock_code + ")",
                                f(".score").innerHTML = "<span>" + l.formateNum(t.total_score, 1) + "</span><span>分</span>",
                                f(".rank-market").appendChild(f("<div><span>全市场排行</span><p>" + t.stock_status + "/" + t.stock_count + "</p></div>")),
                                t.stock_industry_name ? f(".rank-industry").appendChild(f("<div><span>" + t.stock_industry_name + "行业排行&nbsp;</span><p>" + t.stock_industry_status + "/" + t.stock_industry_count + "</p></div>")) : f(".rank-industry").appendChild(f("<div><span>行业排行&nbsp;</span><p>--</p></div>")),
                                f(".draw-score").appendChild(f('<div class="business-info" data-flex="cross:center"><div class="canvas-img"><canvas id="pieChart"></canvas><img id="chartImg" alt="分值画像"/></div><div class="info"></div></div>')),
                                r(t),
                                i.map(function(e, n) {
                                    f(".thermographs").appendChild(a(e, t[e.key], n == i.length - 1, n))
                                }),
                                f(".thermographs").appendChild(e()),
                                changeShowAllStatus(),
                                f(".competitiveness-map").appendChild(u(t)),
                                f(".competitiveness-map").appendChild(f('<p class="legend-name">上市公司占比</p>'));
                            var n = {
                                    avg_data: [t.avgweek_score, t.avgmonth_score, t.avgquarter_score, t.avgyear_score],
                                    rank_data1: [t.week_status, t.month_status, t.querter_status, t.year_status],
                                    rank_data2: [t.industry_week_status, t.industry_month_status, t.industry_quarter_status, t.industry_year_status]
                                },
                                o = "全市场排行",
                                s = t.con_date,
                                c = t.stock_count,
                                p = n.avg_data,
                                d = n.rank_data1;
                            f(".competitiveness-map").appendChild(v({
                                title: o,
                                con_date: s,
                                count: c,
                                avg_data: p,
                                rank_data: d
                            })),
                                o = t.stock_industry_name ? t.stock_industry_name + "行业排行": "行业排行",
                                d = n.rank_data2,
                                c = t.stock_industry_count,
                                f(".competitiveness-map").appendChild(v({
                                    title: o,
                                    con_date: s,
                                    count: c,
                                    avg_data: p,
                                    rank_data: d
                                }))
                        }
                    },
                    A = function(e) {
                        l.ready(function() {
                            AlipayJSBridge.call("setTitle", {
                                title: "吸引力评分"
                            })
                        }),
                        f(".data-load .logo") && (f(".data-load .logo").style.display = "none"),
                            f(".data-load").style.height = screen.availHeight + "px",
                            f(".data-load").style.backgroundColor = "#F5F5F9",
                            f(".data-load").innerHTML = "",
                            f(".data-load").appendChild(f('<img class="no-data" src="' + h + '" alt="提示"/>')),
                            f(".data-load").appendChild(f('<div class="msg"><p>此个股为新股，暂时没有评分</p><p>请明天再来试试！</p></div>'))
                    },
                    E = function() {
                        l.ready(function() {
                            AlipayJSBridge.call("setTitle", {
                                title: "吸引力评分"
                            })
                        }),
                        f(".data-load .logo") && (f(".data-load .logo").style.display = "none"),
                            f(".data-load").style.height = screen.availHeight + "px",
                            f(".data-load").style.backgroundColor = "#F5F5F9",
                            f(".data-load").innerHTML = "",
                            f(".data-load").appendChild(f('<img class="no-data" src="https://gw.alipayobjects.com/os/q/cms/images/jdcwflxr/d8019d5c-cef6-41de-a53e-1da80a24c1d2_w240_h160.png" alt="提示"/>')),
                            f(".data-load").appendChild(f('<p class="msg">数据不小心走丢了，请刷新试试</p>')),
                            f(".data-load").appendChild(f('<div onclick="location.reload()" class="btn">刷新</div>'))
                    },
                    j = {
                        dataResponse: C,
                        callback0: S,
                        callbackAnyError: E,
                        callback1001: A,
                        callbackFail: E
                    };
                c.handleDataResponse(j)
            };
        w();
        var _ = function() {
            var e = function(e) {
                    var n = [],
                        r = [],
                        i = [],
                        o = [],
                        a = [],
                        s = Math.max.apply(null, e.close_price),
                        c = Math.min.apply(null, e.close_price),
                        u = Math.max.apply(null, e.total_score),
                        l = Math.min.apply(null, e.total_score);
                    return l = u == l ? u / 2 : l,
                        a = e.close_price,
                        n = e.total_score,
                        i = e.week_score,
                        o = e.catalyst,
                        t(s, c, u, l, a, n, r, i, o)
                },
                t = function(e, t, n, r, i, o, a, s, c) {
                    var u = f("#myKlineChart"),
                        p = u.getContext("2d"),
                        d = v - 40,
                        h = i.length,
                        g = e + .1 * (e - t),
                        m = t - .1 * (e - t),
                        x = n + .1 * (n - r),
                        b = r - .1 * (n - r),
                        w = g - m,
                        _ = x - b,
                        k = h > 60 ? (d - 3 * h) / h: y;
                    p.clearRect(0, 0, 2 * screen.width, 2 * screen.height);
                    var T = function(e) {
                            return e = l.formateNum(e, 0),
                            (k + 3) * e + k / 2 + 20
                        },
                        C = function(e) {
                            return 320 * (1 - (e - m) / w)
                        };
                    p.beginPath(),
                        p.lineWidth = 2,
                        p.strokeStyle = "#D1DCE2",
                        p.moveTo(20, 160);
                    for (var S = 20,
                             A = 1; A > 0; A++) if (p.lineTo(S + 12, 160), p.moveTo(S + 12 + 4, 160), (S += 16) >= 20 + d) {
                        A = -1;
                        break
                    }
                    p.stroke(),
                        p.closePath(),
                        p.beginPath(),
                        p.strokeStyle = "#FEB457",
                        p.lineWidth = 2,
                        i.map(function(e, t) {
                            if (null != e && void 0 != e) {
                                var n = T(t),
                                    r = C(e);
                                t ? p.lineTo(n, r) : p.moveTo(n, r)
                            }
                        }),
                        p.stroke(),
                        p.closePath();
                    var E = function(e) {
                        return 320 * (1 - (e - b) / _)
                    };
                    p.beginPath(),
                        p.strokeStyle = "#5CA8F3",
                        p.lineWidth = 2;
                    var j = -1;
                    return o.map(function(e, t) {
                        if (null != e && void 0 != e) {
                            var n = T(t),
                                r = E(e);
                            j = t,
                                t ? p.lineTo(n, r) : p.moveTo(n, r)
                        }
                    }),
                        p.stroke(),
                        p.closePath(),
                    0 != g && (p.beginPath(), p.font = "24px Arial", p.fillStyle = "#748390", p.textAlign = "left", p.fillText(l.formateNum(g), 28, 28), p.fillText(l.formateNum(m), 28, 310), p.closePath()),
                    0 != x && (p.beginPath(), p.font = "24px Arial", p.fillStyle = "#748390", p.textAlign = "right", p.fillText(l.formateNum(x), 12 + d, 28), p.fillText(l.formateNum(b), 12 + d, 310), p.closePath()),
                        f("#myKlineChart").toDataURL()
                }; !
                function(t) {
                    f(".Kline-info-bg").style.display = "block",
                    f("#myKlineChart") || f(".Kline-info-bg").appendChild(f('<canvas id="myKlineChart" style="display:none;width:' + v / 2 + 'px;height:160px;vertical-align:top" width="' + v + '" height="320"></canvas>'));
                    var n = e(t);
                    if (f("#Kline-img")) f("#Kline-img").src = n;
                    else {
                        f(".Kline-info-bg").appendChild(f('<img id="Kline-img" style="width:' + v / 2 + 'px; height:160px" src="' + n + '"/>'));
                        var r = "";
                        r += '<div class="legend-kline" data-flex="main:right cross:center">',
                            r += '    <div class="symble score"></div>',
                            r += "    <p>评分(周)</p>",
                            r += '    <div class="symble price"></div>',
                            r += "    <p>收盘线</p>",
                            r += "</div>",
                            f(".Kline-info-bg").appendChild(f(r))
                    }
                    var i = f(".date", 0);
                    i.className = "date sec" + d / 1,
                        i.onclick = switchKlineDate,
                        i = f(".date", 1),
                        i.className = "date sec" + d / 2,
                        i.onclick = switchKlineDate,
                        f(".tabLine").className = "tabLine p" + d
                } (b)
        };
        window.switchKlineDate = function(e) {
            e.currentTarget.dataset.type != d && (d = e.currentTarget.dataset.type, window.TDAPP && window.TDAPP.onEvent("股票诊断—分值曲线图时间区间筛选", p, {
                stock_code: p
            }), w())
        };
        var k = function() {
            var e = [{
                    changeLevel: [5, 10],
                    changeType: "strong",
                    changeValue: "change_company_honor",
                    textKey: ["up_company_honor_detail", "company_honor_detail"],
                    name: "公司品质",
                    sensitiveKey: ""
                },
                    {
                        changeLevel: [3],
                        changeType: "strong",
                        changeValue: "change_marketplace_style",
                        textKey: "marketplace_style_detail",
                        name: "市场风格",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [6],
                        changeType: "stronger",
                        changeValue: "change_achievements_clue",
                        textKey: "achievements_clue_detail",
                        name: "业绩线索",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [3],
                        changeType: "strong",
                        changeValue: "change_stock_valuation",
                        textKey: "stock_valuation_detail",
                        name: "个股估值",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [3],
                        changeType: "strong",
                        changeValue: "change_organization_emotion",
                        textKey: "organization_emotion_detail",
                        name: "机构情绪",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [3],
                        changeType: "strong",
                        changeValue: "change_achievements_appraisal",
                        textKey: "achievements_appraisal_detail",
                        name: "业绩鉴定",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [1, 2.25],
                        changeType: "middle",
                        changeValue: "change_business_status",
                        textKey: "business_status_detail",
                        name: "行业地位",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [4],
                        changeType: "middle",
                        changeValue: "change_profit_ability",
                        textKey: "profit_ability_detail",
                        name: "盈利能力",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [6, 12],
                        changeType: "stronger",
                        changeValue: "change_business_preference",
                        textKey: "business_preference_detail",
                        name: "行业偏好",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [5],
                        changeType: "stronger",
                        changeValue: "change_organization_hold",
                        textKey: "organization_hold_detail",
                        name: "机构持仓",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [1, 4],
                        changeType: "middle",
                        changeValue: "change_success_rate_statistics",
                        textKey: "success_rate_statistics_detail",
                        name: "胜率统计",
                        sensitiveKey: ""
                    },
                    {
                        changeLevel: [3],
                        changeType: "strong",
                        changeValue: "change_achievements_growup",
                        textKey: null,
                        name: "业绩成长性",
                        sensitiveKey: ""
                    }],
                t = {
                    0 : "中",
                    1 : "较强",
                    2 : "很强"
                },
                n = function(e, n, r) {
                    var i = "";
                    return i += '<div class="cell "' + (n === r - 1 ? "last": "") + '" data-flex="dir:left box:justify">',
                        i += '    <p class="cell-name">' + e.name + "</p>",
                        i += '    <p class="cell-summary ' + (l.formateNum(e.summary) > 0 ? "stock-red": "stock-green") + '">' + e.summary + "</p>",
                        i += '    <p class="cell-data sen' + e.sensitive + '">' + t[e.sensitive] + "</p>",
                        i += "</div>",
                        f(i)
                }; !
                function(t) {
                    var r = [],
                        i = [];
                    e.map(function(e, n) {
                        var o = t[e.changeValue];
                        if (o = o && parseFloat(o.toString().slice(0, 10)), 0 != (o = l.formateNum(o, 1)) && void 0 !== o) {
                            var a = "",
                                s = 0,
                                c = e.changeLevel,
                                u = e.changeType,
                                f = (e.textKey, e.name);
                            a = o,
                                s = "middle" === u ? 0 : "stronger" === u ? 2 : 1 === c.length ? Math.abs(o) < c[0] ? 1 : 2 : Math.abs(o) === c[0] ? 1 : 2,
                                r[r.length] = {
                                    name: f,
                                    summary: a,
                                    sensitive: s
                                },
                                i[i.length] = {
                                    name: f,
                                    value: o
                                }
                        }
                    }),
                    r.length && (f(".change-info-bg").style.display = "block", r.map(function(e, t) {
                        f(".change-form-bg").appendChild(n(e, t, r.length))
                    }))
                } (x)
        }
    },
    function(e, t) {
        e.exports = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAR5JREFUSA1jYBgFAx0CjKQ4YPbs2Yr///+fD8Rx6enpj4jRS7QFIMP//ft3AGioHCMj432gJQ7EWMJEjCuQDQeq/wk0XBFoyYGZM2fKEdJP0AI0w49wcHAoAw09SawleC1AN1xQUNAzPj7+KdACd2ItwRkH2AwPCwv7AgsSYPDwA9k7gdgcX5xgtYCQ4aRYgmEBsYYTawkLTCGMBkaeAdDLs4H4ETBZLgcGy2+YHMhyoPx8IIbnA2BS/bht2zb7p0+fRgHFpYH69IDq4XkEwwcww9BpZJ/hC3N0fXhTEUwxsuFAsdF8AAkYtGA5AspkIzMfYKQiYFoG5wMmJqZ4YGA5IQcLLFUh06B8ICsraw9UnwQUnwfNB8hKRtn4QwAA6BwOLVoP9SMAAAAASUVORK5CYII="
    },
    function(e, t) {
        e.exports = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAARZJREFUSA3tk78KwkAMxm0HJ8GnEgQfwcHFtoOTq646K279swq6CM4+27V+nxCo7fUunRxsoNxdLvl+udCMRoP9ugNBs4A0TbfwHfGZMAzXURTdmzHNc1EUc2PMDf5xEATnOI53EhPKRtYkSU7YEzCpquqaZdlS7mwrClqUZfnE3RRfWhdnfOsFdNKQuMdyQEUG6wqJV/rrRnHcP1DIGP4ziuPrv6wTwCgXRCNODSegC6IVVwEskAt8G1dbmCPmfYEESrvkjNXa89r9Z6sGMLoGUYkzpwWAiHMO8jyfYTZeTBZzzUELwCSp1PWLijhinb+qFaCF+MSp0wnwQTTiXkAXRCuuAlggfzYH7EAv4xz0ShiCfR14A2BavF1EiZDdAAAAAElFTkSuQmCC"
    }]);

var signInfo = signInfoMap.makeSign('VzNQumNMxCmPcbD', 'SYRyCEmkmZsMm8xnN5VrLQLXfc7C9GB1', 'GET', 'v1/alipay/get_zyyx_appraisal', {stock_code: "STOCK_CODE", type: 1})
signInfoMap['reqString']=signInfo['reqString'];
signInfo['reqString'];