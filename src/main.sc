require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: /hello
        q!: $regex</start>
        q!: ну здравствуй
        q!: rrrr
        q!: привет
        q!: *дравств*
        q!: *обрый ден*
        q!: *ello*
        q!: *i*
        q!: *обр*
        a: Добрый день!
    state: /weather
        q!: будет ли завтра дождь
        q!: расскажи о погоде
        q!: *огод*
        q!: *олн*
        q!: *ожд*
        q!: *eather*
        random:
            a: Солнечно 18 градусов
            a: Дождь 5 градусов
            a: Гроза 11 градусов
    state: /currency
        q!: курс рубля к доллару
        q!: *урс*
        q!: *алю*
        q!: *urrency*
        q!: *колько*
        q!: обмен валют
        random:
            a: 100 к 1
            a: 20 к 1
            a: 1 к 30
    state: /NoMatch
        event!: noMatch
        random:
            a: Не понял
            a: Не понимаю
            a: Переформулируй